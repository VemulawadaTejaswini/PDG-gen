import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int W = sc.nextInt();
			int H = sc.nextInt();
			int[][] f = new int[H + 1][W + 1];
			for (int i = 0; i < N; ++i) {
				int X = sc.nextInt();
				int Y = sc.nextInt();
				f[Y][X]++;
			}
			int[][] sum = new int[H + 1][W + 1];
			for (int i = 1; i <= H; ++i) {
				for (int j = 1; j <= W; ++j) {
					sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + f[i][j];
				}
			}
			int S = sc.nextInt();
			int T = sc.nextInt();
			int ans = 0;
			for (int i = T; i <= H; ++i) {
				for (int j = S; j <= W; ++j) {
					ans = Math.max(ans, sum[i][j] - sum[i - T][j] - sum[i][j - S] + sum[i - T][j - S]);
				}
			}
			System.out.println(ans);
		}
	}

}