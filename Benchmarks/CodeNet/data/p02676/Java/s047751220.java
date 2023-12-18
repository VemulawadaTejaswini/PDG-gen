import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      String S = sc.next();
      
      // 切り出し
      String result = "";
      int len = S.length();
      if(len <= K){
        result = S;
      }else{
        result = S.substring(0,K) + "...";
      }
      
      // 出力
      System.out.println(result);
    }
    
}