import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long[] A = new long[N];
      long result = 1L;
      
      for(int i = 0; i < N; i++){
        A[i] = sc.nextLong();
        if(A[i] == 0){
          result = 0L;
          break;
        }
      }
      
      // 計算
      if(result != 0){
        for(int i = 0; i < N; i++){
          long old = result;
          result *= A[i];
          if(result > 1000000000000000000L || result < old){
            result = -1;
            break;
          }
        }
      }
      
      
      // 出力
      System.out.println(result);
    }
    
}