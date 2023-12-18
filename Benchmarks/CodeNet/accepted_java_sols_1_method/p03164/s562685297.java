
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static final int INF = Integer.MAX_VALUE;
	static int N = Integer.parseInt(sc.next());
	static int W = Integer.parseInt(sc.next());
	static int V = 1000 * N;
	static int[] w = new int[N];
	static int[] v = new int[N];
	static long[] dp = new long[V+1];
	static {
		Arrays.fill(dp, INF);
		dp[0] = 0;
	}
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		for (int i = 0; i < N; i++) {
			for (int j = V; j >=0; j--) {
//				System.out.println(dp[j]);
				if (j-v[i]>=0) {
					dp[j] = Math.min(dp[j], dp[j-v[i]]+w[i]);
				}
			}
		}
//		System.out.println(Arrays.toString(dp));
		int ans = -1;
		for (int i = 0; i < V+1; i++) {
			if (dp[i] <= W) {
//				System.out.println(dp[i]);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}
