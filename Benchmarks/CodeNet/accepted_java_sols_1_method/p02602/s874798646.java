import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();
      int[] A = new int[N];
      for(int i = 0; i < N; i++){
        A[i] = sc.nextInt();
      }
      
      // 評価
      String[] judge = new String[N-K];
      for(int i = 0; i < N-K; i++){
        if(A[i] < A[i+K]){
          judge[i] = "Yes";
        }else{
          judge[i] = "No";
        }
        
        // 出力
        System.out.println(judge[i]);
      }
      
    }

}