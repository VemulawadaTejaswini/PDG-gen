import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      // 整数の取得
	  int N = sc.nextInt();
      int M = sc.nextInt();
      long K = sc.nextLong();
      //読む時間の取得
      long[] A = new long[N+1];
      long[] B = new long[M+1];
      A[0]=0;
      B[0]=0;
      for(int i=1;i<=N;i++){
        A[i] = A[i-1]+sc.nextLong();
      }
      for(int i=1;i<=M;i++){
        B[i] = B[i-1]+sc.nextLong();
      }
      //Bの冊数
      int j = M;
      //カウント
      int count = 0;
      for(int i=0;i<=N;i++){
        if(A[i]>K){
          break;
        }
        while(A[i]+B[j]>K){
          j--;
        }
         count = Math.max(count,i+j);
      }
		System.out.println(count);
    }
}