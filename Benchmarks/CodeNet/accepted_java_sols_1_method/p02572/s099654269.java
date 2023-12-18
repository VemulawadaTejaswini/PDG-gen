import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long mod = 1000000007;
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	long[] A = new long[N];
	long sum = 0;
	for(int i = 0; i < N; i++){
		A[i] = s.nextLong();
		sum += A[i];
	}
	
	long result = 0;
	for(int i = 0; i < N; i++){
		sum -= A[i];
		result = (result + (sum%mod)*A[i])%mod;
	}

	System.out.println(result);

    
  }
}