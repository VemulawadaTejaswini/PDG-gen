import java.util.Scanner;

public class Main {
	static int n;
	static int s[][];
	static int dp[][][][][][];

	public static int f(int p, int day, int d0, int d3, int d12, int d15) {
		if (day == n) {
			return 1;
		}
		if (p < 0 || 8 < p) {
			return -1;
		}
		if (dp[p][day][d0][d3][d12][d15] == 1) {
			return 1;
		}
		if (p == 0)  d0 = 0; else d0++;
		if (p == 2)  d3 = 0; else d3++;
		if (p == 6) d12 = 0; else d12++;
		if (p == 8) d15 = 0; else d15++;

		int np = p;
		if (p < 3) {
			np += 0;
		} else if (p < 6) {
			np += 1;
		} else {
			np += 2;
		}

		if (s[day][np] + s[day][np + 1] + s[day][np + 4] + s[day][np + 5] != 0) {
			return -1;
		}
		if (6 < d0 || 6 < d3 || 6 < d12 || 6 < d15) {
			return -1;
		}

		for (int i = -2; i <= 2; i++) {
			if (i != 0) {
				if (f(p + i, day + 1, d0, d3, d12, d15) == 1) {
					return dp[p][day][d0][d3][d12][d15] = 1;
				}
			}
		}
		for (int i = -2; i <= 2; i++) {
			if (i != 0) {
				if (f(p + 3 * i, day + 1, d0, d3, d12, d15) == 1) {
					return dp[p][day][d0][d3][d12][d15] = 1;
				}
			}
		}

		return dp[p][day][d0][d3][d12][d15] = -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			s = new int[n][16];
			dp = new int[9][n][7][7][7][7];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 16; j++) {
					s[i][j] = sc.nextInt();
				}
			}

			if (f(4, 0, 0, 0, 0, 0) == 1) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}
}