import java.util.Scanner;

public class Main {
	static int n;
	static int a[][];
	static int max;
	static int dp[][][][];
	static int ax1, ay1, ax2, ay2;

	public static int f(int x1, int y1, int x2, int y2) {
		if (x1 < 0 || n <= x1 || y1 < 0 || n <= y1 ||
				x2 < 0 || n <= x2 || y2 < 0 || n <= y2) {
			return -(1 << 29);
		}
		if (0 <= dp[x1][y1][x2][y2]) {
			return dp[x1][y1][x2][y2];
		}
		if (x1 == x2 && y1 == y2) {
			if (max < a[y1][x1] - 10000) {
				max = a[y1][x1] - 10000;
				ax1 = ax2 = x1;
				ay1 = ay2 = y1;
			}
			return dp[x1][y1][x2][y2] = a[y1][x1] - 10000;
		}
		if (x1 == x2) {
			int sum = f(x1, y1, x2, y2 - 1) + a[y2][x2] - 10000;
			if (max < sum) {
				max = sum;
				ax1 = x1;
				ay1 = y1;
				ax2 = x2;
				ay2 = y2;
			}
			return sum;
		}
		if (y1 == y2) {
			int sum = f(x1, y1, x2 - 1, y2) + a[y2][x2] - 10000;
			if (max < sum) {
				max = sum;
				ax1 = x1;
				ay1 = y1;
				ax2 = x2;
				ay2 = y2;
			}
			return sum;
		}
		int sum = f(x1, y1, x2 - 1, y2 - 1) + f(x2, y1, x2, y2 - 1) + f(x1, y2, x2 - 1, y2) + a[y2][x2] - 10000;
		if (max < sum) {
			max = sum;
			ax1 = x1;
			ay1 = y1;
			ax2 = x2;
			ay2 = y2;
		}
		return sum;
	}
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		a = new int[n][n];
		max = -1;
		ax1 = ax2 = ay1 = ay2 = -1;
		dp = new int[n][n][n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt() + 10000;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					for (int l = 0; l < n; l++) {
						dp[i][j][k][l] = -1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = i; k < n; k++) {
					for (int l = j; l < n; l++) {
						f(i, j, k, l);
					}
				}
			}
		}
		System.out.println(max);
	}
}