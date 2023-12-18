import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int K = sc.nextInt();
		
		final long mod = 998244353L;
		
		int[] l = new int[K];
		int[] r = new int[K];
		for (int i = 0; i < K; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		long[] dp = new long[n];
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < K; j++) {
				for (int k = l[j]; k <= r[j]; k++) {
					if (i + k >= n) break;
					dp[i + k] = (dp[i + k] + dp[i]) % mod;
				}
			}
		}
		
		System.out.println(dp[n - 1]);
		
		sc.close();
	}
}

