import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int H1 = sc.nextInt();
      int M1 = sc.nextInt();
      int H2 = sc.nextInt();
      int M2 = sc.nextInt();
      int K = sc.nextInt();
      
      // 算出
      int hours = 0;
      int minutes = 0;
      
      if(M1 <= M2){
        minutes = M2 - M1;
        hours = H2 - H1;
      }else{
        minutes = M2 - M1 + 60;
        hours = H2 - H1 - 1;
      }
      
      int result = hours*60 + minutes - K;

      // 出力
      System.out.println(result);
    }
    
}