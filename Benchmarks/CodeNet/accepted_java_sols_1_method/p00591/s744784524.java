import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int m[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m[i][j] = sc.nextInt();
				}
			}
			int h[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < n; j++) {
					if (m[i][j] < min) {
						min = m[i][j];
					}
				}
				for (int j = 0; j < n; j++) {
					if (m[i][j] == min)
						h[i][j]++;
				}
			}
			for (int i = 0; i < n; i++) {
				int max = 0;
				for (int j = 0; j < n; j++) {
					if (m[j][i] > max) {
						max = m[j][i];
					}
				}
				for (int j = 0; j < n; j++) {
					if (m[j][i] == max)
						h[j][i]++;
				}
			}
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (h[i][j] == 2)
						ans = Math.max(ans, m[i][j]);
				}
			}
			System.out.println(ans);
		}
	}
}