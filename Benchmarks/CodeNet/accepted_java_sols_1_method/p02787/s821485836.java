import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		int[][] mag = new int[2][n];
		for (int i = 0; i < n; i++) {
			mag[0][i] = Integer.parseInt(sc.next());
			mag[1][i] = Integer.parseInt(sc.next());
		}
		int[][] dp = new int[n][h];
		for (int i = 0; i < h; i++) {
			dp[0][i] = (i / mag[0][0] + 1) * mag[1][0];
		}
		int tmpd;
		int tmph;
		for (int i = 1; i < n; i++) {
			tmpd = mag[0][i];
			tmph = mag[1][i];
			for (int j = 0; j < h; j++) {
				if (j < tmpd) {
					dp[i][j] = Math.min(dp[i - 1][j], tmph);
				} else {
					dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - tmpd] + tmph);
				}
			}
		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < h; j++) {
//				System.out.println(i + "," + j + " " + dp[i][j]);
//			}
//		}
		System.out.println(dp[n - 1][h - 1]);
	}
}
