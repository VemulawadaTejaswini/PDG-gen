import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i=0; i<N; i++)
			A[i] = sc.nextLong();
		
		long gcd = A[0];
		long lcm = A[0];
		long multiple = A[0];
		for(int i=1; i<N; i++) {
			gcd = gcd(gcd, A[i]);
			lcm = lcm*(A[i]/gcd);
			multiple *= A[i];
		}
		
		if(lcm==multiple) {
			System.out.println("pairwise coprime");
		} else if(gcd==1) {
			System.out.println("setwise coprime");
		} else {
			System.out.println("not coprime");
		}
		
		sc.close();
	}
	
	static long gcd(long a, long b) {
		return a==0 ? b : gcd(b%a, a);
	}
}

