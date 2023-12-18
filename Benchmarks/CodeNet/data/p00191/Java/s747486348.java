import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0) return;
			double[][] g = new double[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					g[i][j] = sc.nextDouble();
				}
			}

			double max = 0;
			double[][] dp = new double[2][n];
			for (int i = 0; i < n; i++) dp[0][i] = 1;
			for (int i = 0; i < m - 1; i++) {
				for (int j = 0; j < n; j++) {
					for (int k = 0; k < n; k++) {
						dp[(i + 1) & 1][k] = Math.max(dp[(i + 1) & 1][k], dp[i & 1][j] * g[j][k]);
						max = Math.max(max, dp[(i + 1) & 1][k]);
					}
				}
			}
			BigDecimal bd = new BigDecimal(max);
			System.out.println(bd.setScale(2, BigDecimal.ROUND_HALF_UP));
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	void debug2(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}