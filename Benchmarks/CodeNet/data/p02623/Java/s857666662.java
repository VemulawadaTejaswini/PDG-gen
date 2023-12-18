import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	  int N = sc.nextInt();
      int M = sc.nextInt();
      int K = sc.nextInt();
      int[] A = new int[N];
      int[] B = new int[k];
      int total = 0;
      
      for(int i=0;i<N;i++){
        A[i]=sc.nextInt();
      }
      for(int i=0;i<M;i++){
        B[i]=sc.nextInt();
      }
      
     while(total<K){
          if(A[i]<=B[j] || i>=N){
            total+=A[i];
            i++;
          }else if(B[j]<A[i] || j>=M){
            total+=B[j];
            j++;
          }
     }
      
      System.out.println(total);
    }
}
            