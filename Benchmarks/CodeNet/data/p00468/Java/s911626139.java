import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			boolean[][] map = new boolean[n][n];
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				map[a][b] = true;
				map[b][a] = true;

			}
			for (int i = 1; i < n; i++) {
				if (map[i][0]) {
					for (int j = i; j < n; j++) {
						if (map[i][j]) {
							map[0][j] = true;
						}
					}
				}
			}
			int count = 0;
			for (int i = 1; i < n; i++) {
				if (map[0][i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}