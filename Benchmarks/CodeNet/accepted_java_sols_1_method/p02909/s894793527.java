import java.util.*;

class Main {

    public static void main(String[] args) {

      //入力値取得
      Scanner in = new Scanner(System.in);
      String weather = in.next();
      
      //入力値によって出力する天気を変更する
      switch(weather){
        case"Sunny":
          System.out.println("Cloudy");
          break;
       	case"Cloudy":
          System.out.println("Rainy");
          break;
        case"Rainy":
          System.out.println("Sunny");
          break;
        default:
          System.out.println("Sunny");
        }
    }
}