import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N = Integer.parseInt(sc.next());
	static int W = Integer.parseInt(sc.next());
	static int[] w = new int[N];
	static int[] v = new int[N];
	static long[][] dp = new long[N+1][W+1];
	public static void main(String[] args) {
		for (int i = 0; i < N; i++) {
			w[i] = Integer.parseInt(sc.next());
			v[i] = Integer.parseInt(sc.next());
		}
		for (int i = N-1; i >= 0; i--) {
			for (int j = 0; j <= W; j++) {
				if (j < w[i]) {
					dp[i][j] = dp[i+1][j];
				} else {
					dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j-w[i]] + v[i]);
				}
			}
		}
		System.out.println(dp[0][W]);
	}
}
