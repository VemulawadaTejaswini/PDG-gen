import java.util.*;

public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] B = new int[N-1];
      for(int i=0; i<N - 1; i++){ B[i] = sc.nextInt();}
      int[] A = new int[N];
      for(int i=0; i<N; i++){ A[i] = 100001;}
      int ans=0;
      
      for(int i=0; i<N-1; i++){
      	int n = B[i];
        if(A[i]>n) A[i]=n;
        if(A[i+1]>n) A[i+1]=n;
      }
      for(int i=0; i<N; i++)
        ans += A[i];
      
      System.out.println(ans);

	}
}
