import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
				int m = sc.nextInt();
				for (int j = 0; j < m; j++) {
					a[i][sc.nextInt() - 1] = 1;
				}
			}

			int[] l = new int[n];
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				l[sc.nextInt() - 1] = 1;
			}

			int ans = -1;
			L: for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (a[i][j] < l[j]) {
						continue L;
					}
				}

				if (ans == -1) {
					ans = i + 1;
				} else {
					ans = -1;
					break;
				}
			}

			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}