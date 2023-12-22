import java.util.*;
import java.math.*;
 
public class Main { //クラス名はMain
    public static void main(String[] args) {
      //整数の入力
      Scanner sc = new Scanner(System.in);
      Integer K = Integer.parseInt(sc.next());
      String S = sc.next();

      String answer = K >= S.length() ? S : S.substring(0,K) + "...";

      System.out.println(answer);
    }
}
