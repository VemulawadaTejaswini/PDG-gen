import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      
      // 計算
      long height = 0L;
      for(int i = 1; i < N; i++){
        if(A[i] < A[i-1]){
          height += A[i-1] - A[i];
          A[i] = A[i-1];
        }
      }
      
      // 出力
      System.out.println(height);
    }
    

}