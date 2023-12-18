import java.util.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      // List<String> list = new ArrayList<String>();
      Scanner sc = new Scanner(System.in);
      long X = Long.parseLong(sc.next());

      //黒板の整数
      String answer = "NG";
      long money = 100;
      int count = 0;
      while(true){
        if(money >= X) break;
        money = money + money / 100;
        count++;
      }
      System.out.println(count);
    }
}