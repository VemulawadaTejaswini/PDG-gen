import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //今日の天気を取得し、明日の天気を定義する
        String todayWeather = sc.next();
        String tomorrowWeather = "";
        
        //明日の天気を求める
        if(todayWeather.equals("Sunny")) {
            tomorrowWeather = "Cloudy";
        } else if(todayWeather.equals("Cloudy")) {
            tomorrowWeather = "Rainy";
        } else if(todayWeather.equals("Rainy")) {
            tomorrowWeather = "Sunny";
        } else {
            //何もしない
        }

        //明日の天気を出力する
        System.out.println(tomorrowWeather);
    }
}