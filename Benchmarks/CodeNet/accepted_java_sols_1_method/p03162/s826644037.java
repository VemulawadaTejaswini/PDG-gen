import java.util.Scanner;

//Educational DP Contest / DP まとめコンテスト
//C - Vacation
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int h[][] = new int[N][3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				h[i][j] = Integer.parseInt(sc.next());
			}
		}
		sc.close();

		int[][] dp = new int[N + 2][3];
		dp[0][0] = 0;
		for (int i = 0; i < N; i++) {
			if (i > 0) {
				for (int j = 0; j < 3; j++) {
					for (int k = 0; k < 3; k++) {
						if (j != k) {
							dp[i][j] = Math.max(dp[i][j], dp[i - 1][k] + h[i][j]);
						}
					}
				}
			} else {
				for (int j = 0; j < 3; j++) {
					dp[i][j] = h[i][j];
				}
			}
		}

		System.out.println(
				Math.max(
						Math.max(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));
	}
}
