import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int K = sc.nextInt();
      
      // 計算
      int sum = 0;
      if(K <= A){
        sum = K;
      }else if(K <= A+B){
        sum = A;
      }else{
        sum = A - (K-A-B);
      }
      
      // 出力
      System.out.println(sum);
    }
    
}