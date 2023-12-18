import java.util.*;

public class  Main {
  public static void main(String args[]) {
		    Scanner sc = new Scanner(System.in);

		    int N = sc.nextInt();
		    long A[] = new long [N+1];
		    long B[] = new long [N];
		    long sum = 0;
		    
		    for(int i = 0; i<=N; i++) {
		    	A[i] = sc.nextLong();
		    }
		    
		    for(int i = 0; i<N; i++) {
		    	B[i] = sc.nextLong();
		    }
		    
		    for(int i=N-1;i>=0;i--) {
				sum+=Math.min(A[i+1], B[i]);
				B[i]=Math.max(0, B[i]-A[i+1]);
				sum+=Math.min(A[i], B[i]);
				A[i]=Math.max(0, A[i]-B[i]);
			}
		    
		    System.out.println(sum);
		    
	  }
}
