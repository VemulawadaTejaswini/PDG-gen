import java.util.*;

public class Main {
	static final long MOD = 998244353;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long[][] dp = new long[N+1][S+1];
		dp[0][0] = 1;
		for(int i=0; i<N; i++)
			dp[0][0] = (dp[0][0]*2)%MOD;
		
		long rev2 = rev(2);
		for(int i=0; i<N; i++) {
			for(int j=0; j+A[i]<=S; j++) {
				dp[i+1][j+A[i]] = (dp[i+1][j+A[i]] + dp[i][j]*rev2)%MOD;
			}
			for(int j=0; j<=S; j++) {
				dp[i+1][j] = (dp[i+1][j] + dp[i][j])%MOD;
			}
		}
		
		System.out.println(dp[N][S]);

		sc.close();
	}
	
	static long rev(long n) {
		return pow(n, MOD-2);
	}
	
	static long pow(long n, long p) {
		long ans = 1;
		while(p>0) {
			if((p&1)==1)
				ans = (ans * n)%MOD;
			p>>=1;
			n = (n * n)%MOD;
		}
		
		return ans;
	}


}
