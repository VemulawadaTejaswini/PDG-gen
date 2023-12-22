import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);   
      //取得
	  int N = sc.nextInt();
      int[] B = new int[N-1];
      for(int i=0;i<N-1;i++){
        B[i] = sc.nextInt();
      }
      //Aを作る
      int[] A = new int[N];
      A[0] = B[0];
      for(int i=1;i<N-1;i++){
        if(B[i-1]>B[i]){
          A[i]=B[i];
        }else{
          A[i]=B[i-1];
        }
      }
      A[N-1]=B[N-2];
      //A[]の合計
      int sum = 0;
      for(int i=0;i<N;i++){
          sum+=A[i];
      }
      System.out.println(sum);
    }
}