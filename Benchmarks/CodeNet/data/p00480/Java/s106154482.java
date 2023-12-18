import java.util.Scanner;

// First Grader
public class Main2 {
	public static void main(String[] args) {
		new Main2().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < n; i++)
			number[i] = sc.nextInt();
		long[][] dp = new long[n][21];
		dp[0][0] = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 21; j++) {
				if (dp[i][j] > 0) {
					if (j + number[i] < 21)
						dp[i + 1][j + number[i]] += dp[i][j];
					if (j - number[i] >= 0)
						dp[i + 1][j - number[i]] += dp[i][j];
				}
			}
		}
		System.out.println(dp[n - 1][number[n - 1]]);
		sc.close();
	}
}
import java.util.Scanner;

// First Grader
public class Main2 {
	public static void main(String[] args) {
		new Main2().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for (int i = 0; i < n; i++)
			number[i] = sc.nextInt();
		long[][] dp = new long[n][21];
		dp[0][0] = 1;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < 21; j++) {
				if (dp[i][j] > 0) {
					if (j + number[i] < 21)
						dp[i + 1][j + number[i]] += dp[i][j];
					if (j - number[i] >= 0)
						dp[i + 1][j - number[i]] += dp[i][j];
				}
			}
		}
		System.out.println(dp[n - 1][number[n - 1]]);
		sc.close();
	}
}