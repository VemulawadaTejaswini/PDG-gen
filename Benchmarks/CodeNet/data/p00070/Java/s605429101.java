import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, s;
		int a[];
		short dp[][][];

		a = new int[10];
		while (sc.hasNext()) {
			n = sc.nextInt();
			s = sc.nextInt();
			dp = new short[s + 1][1025][12];
			for (int i = 0; i < s + 1; i++) {
				for (int j = 0; j < 1025; j++) {
					for (int k = 0; k < 12; k++) {
						dp[i][j][k] = -1;
					}
				}
			}
			System.out.println(countFuctrialMemo(dp, n, s, a, 1) + 32768);
//			System.out.println(countFuctrial(n, s, a, 1));
		}
	}

	public static int countFuctrial(int n, int s, int a[], int k) {
		if (k == n + 1) {
			if (s == 0) {
				return 1;
			} else {
				return 0;
			}
		} else {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (0 <= s - k * i) {
					if (a[i] == 0) {
						a[i] = 1;
						count += countFuctrial(n, s - k * i, a, k + 1);
						a[i] = 0;
					}
				} else {
					break;
				}
			}
			return count;
		}
	}

	public static short countFuctrialMemo(short dp[][][], int n, int s, int a[], int k) {
		int binSum = 0;
		int bin = 1;
		for (int i = 0; i < 10; i++) {
			binSum += a[i] * bin;
			bin *= 2;
		}

		if (dp[s][binSum][k] != -1) {
			return dp[s][binSum][k];
		} else if (k == n + 1) {
			if (s == 0) {
				dp[s][binSum][k] = -32767;
			} else {
				dp[s][binSum][k] = -32768;
			}
			return dp[s][binSum][k];
		} else {
			int count = 0;
			for (int i = 0; i < 10; i++) {
				if (0 <= s - k * i) {
					if (a[i] == 0) {
						a[i] = 1;
						count += countFuctrialMemo(dp, n, s - k * i, a, k + 1) + 32768;
						a[i] = 0;
					}
				} else {
					break;
				}
			}
			dp[s][binSum][k] = (short)(count - 32768);
			return dp[s][binSum][k];
		}
	}
}