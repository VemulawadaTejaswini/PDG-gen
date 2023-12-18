import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int D = sc.nextInt();
      int T = sc.nextInt();
      int S = sc.nextInt();
      
      // 判定
      String result = "No";
      if(T*S >= D){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }
    
}