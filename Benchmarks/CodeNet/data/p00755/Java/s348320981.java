import java.util.Scanner;

public class Main {
	static int max = 0;
	static int h, w, c;
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
			max = 0;
			if (h == 0)
				break;
			int panel[][] = new int[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					panel[i][j] = sc.nextInt();
				}
			}
			color(panel, 1);
			System.out.println(max);
		}
	}

	private static void color(int[][] panel, int num) {
		if (num == 6) {
			int[][] copypanel = new int[h][];
			for (int i = 0; i < h; i++)
				copypanel[i] = panel[i].clone();
			copypanel[0][0] = 0;
			n = 1;
			countpanel(copypanel, 0, 0);
			if (n > max) {
				max = n;
			}
			return;
		}
		for (int col = 1; col <= 6; col++) {
			// System.err.println(num + ":" + col);
			if (panel[0][0] == col)
				continue;

			int[][] copypanel = new int[h][];
			for (int i = 0; i < h; i++)
				copypanel[i] = panel[i].clone();

			copypanel[0][0] = col;
			connect(copypanel, 0, 0, col, panel[0][0]);
			color(copypanel, num + 1);
		}

	}

	private static void countpanel(int[][] panel, int i, int j) {
//		debugp(panel);
		if (j + 1 < w) {
			if (panel[i][j + 1] == c) {
				panel[i][j + 1] = 0;
				n++;
				countpanel(panel, i, j + 1);
			}
		}
		if (j - 1 >= 0) {
			if (panel[i][j - 1] == c) {
				panel[i][j - 1] = 0;
				n++;
				countpanel(panel, i, j - 1);
			}
		}
		if (i + 1 < h) {
			if (panel[i + 1][j] == c) {
				panel[i + 1][j] = 0;
				n++;
				countpanel(panel, i + 1, j);
			}
		}
		if (i - 1 >= 0) {
			if (panel[i - 1][j] == c) {
				panel[i - 1][j] = 0;
				n++;
				countpanel(panel, i - 1, j);
			}
		}
	}

	private static void debugp(int[][] panel) {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.err.print(panel[i][j] + " ");
			}
			System.err.println();
		}
	}

	private static int countcolor(int[][] panel) {
		int n = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (panel[i][j] == c) {
					n++;
				}
			}
		}
		return n;
	}

	private static void connect(int[][] panel, int i, int j, int newcol,
			int oldcol) {
		if (j + 1 < w && panel[i][j + 1] == oldcol) {
			panel[i][j + 1] = newcol;
			connect(panel, i, j + 1, newcol, oldcol);
		}
		if (j - 1 >= 0 && panel[i][j - 1] == oldcol) {
			panel[i][j - 1] = newcol;
			connect(panel, i, j - 1, newcol, oldcol);
		}
		if (i + 1 < h && panel[i + 1][j] == oldcol) {
			panel[i + 1][j] = newcol;
			connect(panel, i + 1, j, newcol, oldcol);
		}
		if (i - 1 >= 0 && panel[i - 1][j] == oldcol) {
			panel[i - 1][j] = newcol;
			connect(panel, i - 1, j, newcol, oldcol);
		}
	}

}