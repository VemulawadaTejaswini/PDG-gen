import java.util.*;
public class Main {

	public static void main(String[] args) {
		int MOD = 998244353;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] L = new int[K];
		int[] R = new int[K];
		for(int i = 0; i < K; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		long[] dp = new long[N+1];
		long[] dpsum = new long[N+1];
		dp[1] = dpsum[1] = 1;
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j < K; j++) {
				int li = i - R[j];
				int ri = i - L[j];
				if(ri < 0)
					continue;
				li = Math.max(li, 1);
				dp[i] += dpsum[ri] - dpsum[li-1] + MOD;
				dp[i] %= MOD;
			}
			dpsum[i] = (dpsum[i-1] + dp[i]) % MOD;
		}
		System.out.println(dp[N]);
	}

}