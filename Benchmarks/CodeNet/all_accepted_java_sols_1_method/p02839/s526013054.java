import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int[][] a = new int[h][w];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < w; j++) {
				a[i][j] = Integer.parseInt(sa[j]);
			}
		}
		int[][] b = new int[h][w];
		for (int i = 0; i < h; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < w; j++) {
				b[i][j] = Integer.parseInt(sa[j]);
			}
		}
		br.close();

		int[][] c = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				c[i][j] = Math.abs(a[i][j] - b[i][j]);
			}
		}

		boolean[][][] d = new boolean[h][w][6401];
		d[0][0][c[0][0]] = true;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (i > 0) {
					for (int k = 0; k <= 6400 - c[i][j]; k++) {
						if (d[i - 1][j][k]) {
							d[i][j][Math.abs(k - c[i][j])] = true;
							d[i][j][k + c[i][j]] = true;
						}
					}
				}
				if (j > 0) {
					for (int k = 0; k <= 6400 - c[i][j]; k++) {
						if (d[i][j - 1][k]) {
							d[i][j][Math.abs(k - c[i][j])] = true;
							d[i][j][k + c[i][j]] = true;
						}
					}
				}
			}
		}

		for (int i = 0; i <= 6400; i++) {
			if (d[h - 1][w - 1][i]) {
				System.out.println(i);
				break;
			}
		}
	}
}
