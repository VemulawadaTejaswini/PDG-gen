import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		int[][] a = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			a[l][r]++;
		}
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				a[i][j] += a[i][j - 1];
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				a[i][j] += a[i - 1][j];
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int answer = a[y][y];
			if (x > 0) {
				answer += -a[y][x - 1] - a[x - 1][y] + a[x - 1][x - 1];
			}
			sb.append(answer);
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
