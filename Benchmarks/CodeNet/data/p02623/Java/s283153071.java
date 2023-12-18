
import java.util.*;

public class Main
{

    private final static int MOD = 1_000_000_007;

    public static int gcd(int a, int b) { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    }
    
    public static long mod(long a, long b) {
        return ((a % b) + b ) % b;
    }

    public static int mod (int a, int b) {
        return ((a % b) + b ) % b;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int M = in.nextInt();
	int K = in.nextInt();
	in.nextLine();
	long[] A = new long[N], B = new long[M];
	for (int i = 0; i < N; i++) {
	    A[i] = in.nextLong();
	    if (i > 0) A[i] += A[i-1];
	}
	in.nextLine();
	for (int i = 0; i < M; i++) {
	    B[i] = in.nextLong();
	    if (i > 0) B[i] += B[i-1];
	}
	int res = 0;
	for (int i = 0, j = M-1; i < N; i++) {
	    while (j > -1 && A[i] + B[j] > K) j--;
	    if (A[i] > K) break;
	    res = Math.max(res, i+j+2);
	}
	System.out.println(res);
        in.close();
    }


			       
}
