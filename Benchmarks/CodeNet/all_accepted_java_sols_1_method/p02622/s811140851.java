import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      String T = sc.next();
      
      // 操作
      int len = S.length();
      int count = 0;
      for(int i = 0; i < len; i++){
        if(S.charAt(i) != T.charAt(i)){
          count++;
        }
      }
      
      // 出力
      System.out.println(count);
    }
    

}