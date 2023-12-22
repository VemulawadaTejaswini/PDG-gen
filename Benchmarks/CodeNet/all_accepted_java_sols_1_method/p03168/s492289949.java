import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double p[] = new double[n + 1];
		double q[] = new double[n + 1];
		for ( int i = 1; i <= n; i++ ) {
			p[i] = in.nextDouble();
			q[i] = 1 - p[i];
		}
		in.close();

		//		for(int i = 0; i<= n; i++) {
		//			System.out.println(p[i] + "  " + q[i]);
		//		}

		int row = n / 2 + 1;
		double dp[][] = new double[row + 1][n + 2];
		dp[1][1] = 1;
		for ( int r = 1; r <= row; r++ ) {
			for ( int c = 1; c <= n + 1; c++ ) {
				int idx = r + c - 2;
				dp[r][c] += dp[r][c - 1] * p[idx];
				dp[r][c] += dp[r - 1][c] * q[idx];
				if ( idx >= n ) break;
			}
		}

//		for ( double[] ds : dp ) {
//			for ( double d : ds ) {
//				System.out.printf("%1.3f   ", d);
//			}
//			System.out.println();
//		}

		double ans = 0.0;
		for ( int r = 1, c = n + 1; r <= row; r++, c-- ) {
			ans += dp[r][c];
		}
		System.out.println(ans);
	}
}
