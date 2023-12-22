import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // 判定
      char c3 = S.charAt(2);
      char c4 = S.charAt(3);
      char c5 = S.charAt(4);
      char c6 = S.charAt(5);
      
      String result = "No";
      if(c3 == c4 && c5 == c6){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }
    
}