package cn.edu.sdwu.android.classroom.sn170507180214;


import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Ch4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        //加载界面(不要写文件名)，使用资源ID来引用资源
        setContentView(R.layout.layout_ch4_1);
//1)获取普通界面组件
        Button button=(Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView)findViewById(R.id.ch4_iv);
//3)
        button.setOnClickListener(new MyClickListener());

        imageView.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View view) {
                WallpaperManager wallpaperManager = (WallpaperManager)getSystemService(WALLPAPER_SERVICE);
                try {
                    wallpaperManager.setResource(R.raw.img);
                } catch (Exception e) {
                    Log.e(Ch4Activity.class.toString(), e.toString());
                }
                    return true;
                }
            });
        }

    //2)
    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            Log.i(Ch4Activity.class.toString(), "button click");}
    }
}

