import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();//肥料の種類
			int m = stdIn.nextInt();//肥料を与える回数
			if(n + m == 0) break;

			double[][] table = new double[n][n];
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					table[r][c] = stdIn.nextDouble();
				}
			}
			double[][] dp = new double[m][n];
			for(int r = 0; r < dp[0].length; r++) {
				dp[0][r] = 1;
			}
			for(int k = 1; k < n; k++) {
				for(int r = 0; r < n; r++) {
					for(int c = 0; c < m; c++) {
						dp[k][c] = Math.max(dp[k][c], dp[k - 1][r] * table[r][c]);
					}
				}
			}
			double ans = -1;
			for(int r = 0; r < dp[dp.length - 1].length; r++) {
				ans = Math.max(ans, dp[dp.length - 1][r]);
			}
			BigDecimal answer = new BigDecimal(String.valueOf(ans));
			ans = answer.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.printf("%.2f\n", ans);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}