package com.iqbalk21.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickHandle(View view) {
        switch (view.getId()){
            case R.id.spotify :
                Toast.makeText(MainActivity.this, "This button will launch my Spotify Streamer App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.football:
                Toast.makeText(MainActivity.this, "This button will launch my Super Duo App : Football scores!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library :
                Toast.makeText(MainActivity.this, "This button will launch my Super Duo App : Library!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bib :
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz :
                Toast.makeText(MainActivity.this, "This button will launch my XYZ Reader App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone :
                Toast.makeText(MainActivity.this, "This button will launch my Capstone App!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
