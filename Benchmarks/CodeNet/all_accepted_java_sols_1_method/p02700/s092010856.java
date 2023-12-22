import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int D = sc.nextInt();
      String result = "";
      
      // バトル
      while(A > 0 && C > 0){
        C = C - B;
        if(C <= 0){
          result = "Yes";
          break;
        }
        A = A - D;
        if(A <= 0){
          result = "No";
        }
      }
      
      // 出力
      System.out.println(result);
    }
}