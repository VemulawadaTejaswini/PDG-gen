import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      
      // 判定
      String result = "NO";
      if((A == 7 && B == 5 && C == 5) || 
         (A == 5 && B == 7 && C == 5) || 
         (A == 5 && B == 5 && C == 7)){
           result = "YES";
      }
      
      // 出力
      System.out.println(result);
    }
    
}