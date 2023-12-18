import java.util.Scanner;

public class Main {
	final static int INT_MAX = 100000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int[][] table = new int[n][n];
			int m = sc.nextInt();
			int s = sc.nextInt();
			int g1 = sc.nextInt();
			int g2 = sc.nextInt();
			if (n == 0 && m == 0 && s == 0 && g1 == 0 && g2 == 0)
				break;
			int min = INT_MAX;
			for (int i = 0; i < m; i++) {
				int b1 = sc.nextInt();
				int b2 = sc.nextInt();
				int c = sc.nextInt();
				table[b1 - 1][b2 - 1] = c;
			}
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (table[i][j] == 0)
						table[i][j] = INT_MAX;
			for (int i = 0; i < n; i++)
				table[i][i] = 0;
			for (int k = 0; k < n - 1; k++)
				for (int i = 0; i < n - 1; i++)
					for (int j = 0; j < n - 1; j++) {
						table[i][j] = Math.min(table[i][j], table[i][k]
								+ table[k][j]);
					}
			for (int i = 0; i < n - 1; i++) {
				min = Math.min(min, table[s - 1][i] + table[i][g1 - 1]
						+ table[i][g2 - 1]);
			}
			System.out.println(min);
		}
		sc.close();
	}
}