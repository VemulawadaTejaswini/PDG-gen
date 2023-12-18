import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int[] v = new int[N];
		for (int i = 0; i < N; ++i) {
			v[i] = sc.nextInt();
		}
		long[][] dp = new long[N - 1][21];
		dp[0][v[0]] = 1;
		for (int i = 1; i < N - 1; ++i) {
			for (int j = 0; j <= 20; ++j) {
				if (j + v[i] <= 20) {
					dp[i][j + v[i]] += dp[i-1][j];
				}
				if (j - v[i] >= 0) {
					dp[i][j - v[i]] += dp[i-1][j];
				}
			}
		}
		System.out.println(dp[N - 2][v[N - 1]]);
	}

}