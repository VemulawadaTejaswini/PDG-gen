mport java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      // 整数の取得
	  int N = sc.nextInt();
      int M = sc.nextInt();
      long K = sc.nextLong();
      //読む時間の取得
      long[] A = new long[N];
      long[] B = new long[M];
      
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
      }
       
      for(int i=0;i<M;i++){
        B[i] = sc.nextLong();
      }
      
      //カウント
      int i=0;
      int j=0;
      int sum=0;
      int count=0;
      
      while(sum<K){
           if(A[i]<=B[j] || j>=M){
               sum+=A[i];
               i++;
           }else if(A[i]>B[j] || i>=N){
               sum+=B[j];
               j++;
           }
          count++;
      }
 
		System.out.println(count);
    }
}