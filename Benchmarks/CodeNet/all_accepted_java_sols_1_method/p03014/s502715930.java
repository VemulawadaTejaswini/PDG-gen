import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] map = new char[h][w];
		for (int i = 0; i < h; i++) {
			map[i] = sc.next().toCharArray();
		}
		int row[][] = new int[h][w];
		int col[][] = new int[h][w];
		int cnt = 0;
		int s = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				cnt = 0;
				if (map[i][j] == '.') {
					cnt++;
					s = j;
					j++;
					while (true) {
						if (j >= w || map[i][j] == '#') {
							break;
						} else if (map[i][j] == '.') {

							cnt++;
						}
						j++;
					}
					for (int k = s; k < j; k++) {
						row[i][k] = cnt;
					}
				}
			}
		}

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				cnt = 0;
				if (map[j][i] == '.') {
					cnt++;
					s = j;
					j++;
					while (true) {
						if (j >= h || map[j][i] == '#') {
							break;
						} else if (map[j][i] == '.') {
							cnt++;
						}
						j++;
					}
					for (int k = s; k < j; k++) {
						col[k][i] = cnt;
					}
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				ans = Math.max(ans, col[i][j] + row[i][j] - 1);
			}
		}
		System.out.println(ans);

	}
}