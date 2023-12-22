import java.util.*;

public class Main {
    public static void main(String[] args) {
        //天気を格納するリスト
        ArrayList<String> weather = new ArrayList<String>();
        //天気をリストに格納
        weather.add("Sunny");
        weather.add("Cloudy");
        weather.add("Rainy");
        //今日の天気
        String nowWeaher;
        //標準入力を読み込むためのScanner
        Scanner sc = new Scanner(System.in);
        
        //今日の天気を標準入力から読み込む
        nowWeaher = sc.next();
        //リストから該当する天気のインデックスを探す
        int tomorrow_weather = weather.indexOf(nowWeaher) + 1;
        //もしリストの総数を超えていたら最初に戻る
        if(tomorrow_weather >= weather.size()){
            tomorrow_weather = 0;
        }
        //明日の天気を表示
        System.out.println(weather.get(tomorrow_weather));
        
    }
}
