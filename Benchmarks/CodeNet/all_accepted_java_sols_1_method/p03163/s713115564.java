import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		long[] ws = new long[N+1];
		long[] vs = new long[N+1];
		long[] dp = new long[W+1];
		int INF = Integer.MAX_VALUE;
		long max = 0;

		ws[0] = 0;
		vs[0] = 0;
		for (int i = 1; i <= N; ++i) {
			ws[i] = sc.nextLong();
			vs[i] = sc.nextLong();
		}
		Arrays.fill(dp, INF);
		dp[0] = 0;

		for (int i = 1; i <= N; ++i) {
			for (int j = W; j >= 0; --j) {
				if (dp[j] != INF && j + ws[i] <= W) {
					if (dp[j] + vs[i] > dp[(int)(j+ws[i])] || dp[(int)(j+ws[i])] == INF) {
						dp[(int)(j+ws[i])] = dp[j] + vs[i];
						if (dp[(int)(j+ws[i])] > max)max = dp[(int)(j+ws[i])];
					}
				}
			}
		}
		System.out.println(max);
	}
}
