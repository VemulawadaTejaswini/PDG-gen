import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      
      // 判定
      int lenS = S.length();
      String partT = T.substring(0,lenS);
      String result = "No";
      if(S.equals(partT)){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }

}