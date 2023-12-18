import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static final long MOD = 1_000_000_007;

	public static void main(String[] args) {
		int N = sc.nextInt();
		double[] P = new double[N];
		for (int i = 0; i < N; i++) {
			P[i] = sc.nextDouble();
		}
		double[][] dp = new double[N + 1][N + 1];
		dp[0][0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= i; j++) {
				dp[i + 1][j + 1] += dp[i][j] * P[i];
				dp[i + 1][j] += dp[i][j] * (1 - P[i]);
			}
		}
		double ans = 0;
		for (int i = N; i > N / 2; i--) {
			ans += dp[N][i];
		}
		System.out.printf("%.10f\n", ans);
	}
}