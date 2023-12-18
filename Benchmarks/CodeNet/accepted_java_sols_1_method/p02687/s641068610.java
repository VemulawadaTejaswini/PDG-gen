import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // 判定
      String result = "";
      if(S.equals("ABC")){
        result = "ARC";
      }else{
        result = "ABC";
      }
      
      // 出力
      System.out.println(result);
    }

}