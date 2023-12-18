import java.util.Scanner;

class Main{
	static int mod = 1000000000 + 7;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			double[] p = new double[N];
			for(int i = 0; i < N; i++) p[i] = sc.nextDouble();
			double[][] dp = new double[N + 1][N + 1];
			dp[0][0] = 1;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(dp[i][j] == 0) continue;
					dp[i + 1][j + 1] += dp[i][j] * p[i];
					dp[i + 1][j] += dp[i][j] * (1 - p[i]);
				}
			}
			double ans = 0;
			for(int i = (N + 1) / 2; i <= N; i++) {
				ans += dp[N][i];
			}
			System.out.println(ans);
		}
	}
}