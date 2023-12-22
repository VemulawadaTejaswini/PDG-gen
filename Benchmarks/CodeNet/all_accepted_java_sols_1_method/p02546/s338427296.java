import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      // 複数形作成
      int len = S.length();
      String result = "";
      if(S.charAt(len-1) == 's'){
        result = S + "es";
      }else{
        result = S + "s";
      }
      
      // 出力
      System.out.println(result);
    }

}