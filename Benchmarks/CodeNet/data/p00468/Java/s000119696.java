import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			boolean[][] map = new boolean[n][n];
			int[] fnum = new int[n];
			int fcount = 0;
			int m = in.nextInt();
			for (int i = 0; i < m; i++) {
				int a = in.nextInt() - 1;
				int b = in.nextInt() - 1;
				if (a == 0) {
					fnum[fcount] = b;
					fcount++;
				}
				map[a][b] = true;
				map[b][a] = true;
			}
			int count = fcount;
			for (int i = 0; i < fcount; i++) {
				int num = fnum[i];
				for (int j = 1; j < n; j++) {
					if (map[num][j]) {
						if (!map[0][j]) {
							count++;
						}
						map[0][j] = true;
					}
				}
			}
			System.out.println(count);
		}
	}
}