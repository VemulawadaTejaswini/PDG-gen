import java.util.Scanner;

public class Main {
	static int n, m;
	static int win[][], pic[][];

	public static boolean search(int x, int y) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (pic[i][j] != -1 && win[y + i][x + j] != pic[i][j]) {
					return false;
				}
			}
		}
		return true;
	}

	public static int[][] turn() {
		int a[][] = new int[m][m];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				a[m - j - 1][i] = pic[i][j];
			}
		}

		return a;
	}

	public static void ans(int x, int y) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if (pic[i][j] != -1) {
					System.out.println((x + j) + " " + (y + i));
					return ;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		L: while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}
			win = new int[n][n];
			pic = new int[m][m];

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					win[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < m; j++) {
					pic[i][j] = sc.nextInt();
				}
			}

			for (int q = 0; q < 4; q++) {
				for (int i = 0; i < n - m ; i++) {
					for (int j = 0; j < n - m; j++) {
						if (search(j, i)) {
							ans(j + 1, i + 1);
							continue L;
						}
					}
				}
				pic = turn();
			}
			System.out.println("NA");
		}
	}
}