

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int c = sc.nextInt();
		int[][] a = new int[n][m];
		int[] b = new int[m];

		for (int i = 0; i < m; i++) {
			b[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		int ans = 0;

		for (int i = 0; i < n; i++) {

			long sum = 0;
			for (int j = 0; j < m; j++) {
				sum += a[i][j] * b[j];
			}
			if (sum + c > 0)
				ans++;
		}

		System.out.println(ans);

	}

}
