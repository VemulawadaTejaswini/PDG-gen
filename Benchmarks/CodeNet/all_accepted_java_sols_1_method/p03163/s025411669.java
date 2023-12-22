import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int w[] = new int[N];
		long v[] = new long[N];
		for(int i = 0; i < N; i++) {
			w[i] = sc.nextInt();
			v[i] = sc.nextLong();
		}
		
		long dp[][] = new long[N + 1][W + 1];
		Arrays.fill(dp[0], 0);
		//dp[0][0] = 0;
		long ans = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j <= W; j++) {
				if(j - w[i - 1] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i - 1]] + v[i - 1]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
				if(i == N) {
					ans = Math.max(ans, dp[i][j]);
				}
			}
		}
		System.out.println(ans);
	}
}
