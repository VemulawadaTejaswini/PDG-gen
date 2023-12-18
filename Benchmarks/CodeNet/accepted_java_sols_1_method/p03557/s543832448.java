import java.util.*;	
public class Main {
public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] A  = new double[N];
		double[] B  = new double[N];
		double[] C  = new double[N];
		long count = 0;
		
	    for(int i=0; i<N; i++) {
			A[i]=sc.nextInt();			
	    }
	    for(int i=0; i<N; i++) {
			B[i]=sc.nextInt();			
	    }
	    for(int i=0; i<N; i++) {
			C[i]=sc.nextInt();			
	    }
	    Arrays.sort(A);
	    Arrays.sort(B);
	    Arrays.sort(C);
	    for(int i = 0; i<N; i++) {
	    	long foundA=0,foundC=0;
	    	foundA=-1-Arrays.binarySearch(A,B[i]-0.1);
	    	foundC=N+1+Arrays.binarySearch(C,B[i]+0.1);
	    	count+=foundA*foundC;
	     }
	    System.out.println(count);
	  }	          	
}