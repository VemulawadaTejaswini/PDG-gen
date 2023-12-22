import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		char[][] array = new char[q * 2][1000];
		for (int i = 0; i < q * 2; i++) {
			array[i] = scanner.next().toCharArray();
		}

		for (int l = 0; l < q * 2; l += 2) {
			int n = array[l].length;
			int m = array[l + 1].length;
			int[][] dp = new int[n + 1][m + 1];
			boolean flag = false;
			char[] a = Arrays.copyOf(array[l],n);
			char[] b = Arrays.copyOf(array[l+1], m);
			for (int i = 1; i < n + 1; i++) {
				for (int j = 1; j < m + 1; j++) {
					//System.out.println(array[0][i - 1] + ":" +array[1][j - 1]);
					if (a[i - 1] == b[j - 1]) {
						dp[i][j] += dp[i - 1][j - 1] + 1;
					} else {
						dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					}
				}
			}
//			for (int i = 0; i < n + 1; i++) {
//				for (int j = 0; j < m + 1; j++) {
//					System.out.print(dp[i][j]);
//				}
//				System.out.println();
//			}

			System.out.println(dp[n][m]);
		}
	}
}