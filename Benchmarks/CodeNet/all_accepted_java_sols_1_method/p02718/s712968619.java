import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] A = new int[N];
      int total = 0;
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
        total += A[i];
      }
      
      // 人気商品判定
      int popular = total / (4 * M);
      if(total % (4 * M) > 0){
        popular++;
      }
      int count = 0;

      for(int i = 0; i < N; i++){
        if(popular <= A[i]){
          count++;
        }
      }
      
      String result = "No";
      if(M <= count){
        result = "Yes";
      }
      
      // 出力
      System.out.println(result);
    }
}