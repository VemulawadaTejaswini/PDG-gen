import java.util.*;
public class Main {
	public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
      
      // 整数の取得
	  int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();
      //読む時間の取得
      int[] A = new int[N];
      int[] B = new int[M];
      
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
      }
       
      for(int i=0;i<M;i++){
        B[i] = sc.nextInt();
      }
      
      //総時間と読んだ本の合計
      int sum=0;
      int count=0;
      
        while(sum<=M){
           if(A[i]<=B[j]){
               sim+=A[i];
               i++;
           }else if(A[i]>B[j]){
               sim+=B[j];
               j++;
           }
          count++;
        }
 
		System.out.println(count);
    }
}