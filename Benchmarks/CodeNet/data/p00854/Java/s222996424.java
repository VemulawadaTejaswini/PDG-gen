import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		/*
		int[][] ans = new int[10001][10001];
		for (int j = 1; j < 10001; j++) {
			ans[1][j] = 0;
		}
		for (int i = 2; i < 10001; i++) {
			for (int j = 1; j < 10001; j++) {
				ans[i][j] = (ans[i - 1][j] + j) % i;
			}
		}
		*/

		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int m = sc.nextInt();
			if ((n | k | m) == 0) {
				break;
			}

			int[] ans = new int[n];
			ans[1] = 0;
			for (int i = 2; i < n; i++) {
				ans[i] = (ans[i - 1] + k) % i;
			}
			System.out.println((ans[n - 1] + m) % n + 1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}