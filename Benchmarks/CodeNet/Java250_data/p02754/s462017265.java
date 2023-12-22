import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long A = sc.nextLong();
      long B = sc.nextLong();
      
      // 周期数と余りをカウント
      long roop = N / (A+B);
      long remain = N % (A+B);
      
      // 青いボールをカウント
      long result = A * roop;
      if(remain < A){
        result += remain;
      }else{
        result += A;
      }
        
      // 出力
      System.out.println(result);
    }
    
}