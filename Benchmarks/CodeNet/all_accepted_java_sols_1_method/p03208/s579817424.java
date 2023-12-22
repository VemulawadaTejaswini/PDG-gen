
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K= sc.nextInt();
		int A [] = new int [N];
	    
	    for(int i = 0; i < N; i++) {
	    	A[i]=sc.nextInt();
	    }
	    sc.close();
	    Arrays.sort(A);
	    
	    int min = 1_000_000_007;
	    for(int i = 0; i < N-K+1; i++) {
	    	min = Math.min(A[i+K-1]-A[i], min);
	    }
	    System.out.println(min);
	}

}
