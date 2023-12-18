import java.util.*;

public class Main {
	static int h, w, n;
	static char[][] tfield;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();
		char[][] field = new char[h][w];
		for (int i = 0; i < h; i++) {
			String s = sc.next();
			char[] ch = s.toCharArray();
			for (int j = 0; j < w; j++)
				field[i][j] = ch[j];
		}
		String result = "NO";
		out: for (int i = 0; i < h; i++)
			for (int j = 0; j < w - 1; j++) {
				tfield = new char[h][w];
				for (int k = 0; k < h; k++)
					for (int l = 0; l < w; l++)
						tfield[k][l] = field[k][l];
				if (tfield[i][j] != '.' && tfield[i][j + 1] != '.') {
					move(i, j);
					if (finished()) {
						result = "YES";
						break out;
					}
				}
			}
		System.out.println(result);
		sc.close();
	}

	static void move(int i, int j) {
		char tmp = tfield[i][j];
		tfield[i][j] = tfield[i][j + 1];
		tfield[i][j + 1] = tmp;
		while (erase())
			fall();
	}

	static boolean erase() {
		boolean result = false;
		boolean[][] bfield = new boolean[h][w];
		int[] dx = { -1, 0 }, dy = { 0, -1 };
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++) {
				bfield[i][j] = false;
				if (tfield[i][j] != '.') {
					for (int k = 0; k < 2; k++) {
						boolean b = false;
						if (i + dy[k] * (n - 1) >= 0
								&& j + dx[k] * (n - 1) >= 0) {
							b = true;
							for (int l = 0; l < n; l++) {
								b = b
										&& (tfield[i][j] == tfield[i + dy[k]
												* l][j + dx[k] * l]);

							}
						}
						int nx = j, ny = i;
						while (b && nx >= 0 && ny >= 0
								&& tfield[i][j] == tfield[ny][nx]) {
							bfield[ny][nx] = true;
							nx += dx[k];
							ny += dy[k];
						}
					}
				}
			}
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				if (bfield[i][j]) {
					tfield[i][j] = '.';
					result = true;
				}
		return result;
	}

	static void fall() {
		for (int i = h - 1; i > 0; i--)
			for (int j = 0; j < w; j++)
				if (tfield[i][j] == '.') {
					int pointer = i;
					while (tfield[pointer][j] == '.' && pointer != 0)
						pointer--;
					if (pointer != 0 || tfield[pointer][j] != '.') {
						tfield[i][j] = tfield[pointer][j];
						tfield[pointer][j] = '.';
					}
				}
	}

	static boolean finished() {
		boolean result = true;
		for (int i = 0; i < h; i++)
			for (int j = 0; j < w; j++)
				result = result && tfield[i][j] == '.';
		return result;
	}

}