import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      long X = sc.nextLong();
      long K = sc.nextLong();
      long D = sc.nextLong();
      
      // 算出
      long absX = Math.abs(X);
      long div = absX / D;
      long min1 = absX % D;
      long min2 = Math.abs(min1 - D);
      
      long result = 0L;
      if(K < div){
        result = absX - D * K;
      }else{
        if(div % 2 == 1){
          if(K % 2 == 1){
            result = min1;
          }else{
            result = min2;
          }
        }else{
          if(K % 2 == 0){
            result = min1;
          }else{
            result = min2;
          }
        }
      }
      
      // 出力
      System.out.println(result);
    }

}