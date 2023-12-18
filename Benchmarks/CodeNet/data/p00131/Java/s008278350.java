import java.util.Scanner;

public class Main {
	static byte ans[][];

	public static boolean f(int a[][], int s[], int n) {
		if (10 <= n) {
			int b[][] = new int[10][10];
			ans = new byte[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					b[i][j] = a[i][j];
				}
			}
			for (int i = 0; i < 10; i++) {
				if (s[i] == 1) {
					reverse(b, 0, i);
					ans[0][i] = 1;
				}
			}
			for (int i = 1; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					if (b[i - 1][j] == 1) {
						reverse(b, i, j);
						ans[i][j] = 1;
					}
				}
			}
			if (check(b)) {
				return true;
			}
		} else {
			s[n] = 0;
			if (f(a, s, n + 1)) {
				return true;
			}
			s[n] = 1;
			if (f(a, s, n + 1)) {
				return true;
			}
		}
		return false;
	}

	public static void reverse(int a[][], int i, int j) {
		a[i][j] = (a[i][j] + 1) % 2;
		if (0 <= i - 1) {
			a[i - 1][j] = (a[i - 1][j] + 1) % 2;
		}
		if (i + 1 < 10) {
			a[i + 1][j] = (a[i + 1][j] + 1) % 2;
		}
		if (0 <= j - 1) {
			a[i][j - 1] = (a[i][j - 1] + 1) % 2;
		}
		if (j + 1 < 10) {
			a[i][j + 1] = (a[i][j + 1] + 1) % 2;
		}
	}

	public static boolean check(int a[][]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (a[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		int a[][];

		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a = new int[10][10];
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					a[j][k] = sc.nextInt();
				}
			}
			f(a, new int[10], 0);
			for (int j = 0; j < 10; j++) {
				String s = "";
				for (int k = 0; k < 10; k++) {
					System.out.print(s + ans[j][k]);
					s = " ";
				}
				System.out.println();
			}
		}
	}
}