import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long lsum[][] = new long[n][n]; // local sum:部分和
		for ( int c = 0; c < n; c++ ) {
			lsum[c][c] = in.nextInt();
			for ( int r = 0; r < c; r++ ) {
				lsum[r][c] = lsum[r][c - 1] + lsum[c][c];
			}
		}

		long cost[][] = new long[n][n]; // 累積コスト
		for ( int p = 1; p < n; p++ ) {
			for ( int r = 0, c = p; c < n; r++, c++ ) {
				Long min = Long.MAX_VALUE;
				for ( int i = r; i <= c - 1; i++ ) {
					if(min > cost[r][i] + cost[i + 1][c]) {
						min = cost[r][i] + cost[i + 1][c];
					}
				}
				cost[r][c] = min + lsum[r][c];
			}
		}

		System.out.println(cost[0][n - 1]);
		in.close();
	}
}
