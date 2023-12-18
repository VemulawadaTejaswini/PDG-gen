import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String alpha = sc.next();
      char c = alpha.charAt(0);
      
      // 判定
      String result ="";
      if('a' <= c && c <= 'z'){
        result = "a";
      }else{
        result = "A";
      }
      
      // 出力
      System.out.println(result);
    }

}