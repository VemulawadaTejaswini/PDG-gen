import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Grid
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {
			int n = Integer.parseInt(line);
			byte[][] grid = new byte[n][n];

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				for (int j = 0; j < n; j++) {
					grid[i][j] = (byte) (line.charAt(j) - '0');
				}
			}

			byte max = 0;
			// 左右
			for (int i = 0; i < n; i++) {
				byte sum = 0;
				for (int j = 0; j < n; j++) {
					if (grid[i][j] > 0) {
						sum++;
					} else {
						sum = 0;
					}
					if (sum > max)
						max = sum;
				}
			}
			// 上下
			for (int i = 0; i < n; i++) {
				byte sum = 0;
				for (int j = 0; j < n; j++) {
					if (grid[j][i] > 0) {
						sum++;
					} else {
						sum = 0;
					}
					if (sum > max)
						max = sum;
				}
			}
			// 対角線(右上->左下)
			for (int i = 0; i < 2 * n - 1; i++) {
				byte sum = 0;
				int p, q, r;
				if (i < n) {
					p = i;
					q = 0;
					r = i + 1;
				} else {
					p = n - 1;
					q = i - n + 1;
					r = n;
				}
				for (int j = q; j < r; j++) {
					// try {
					// System.out.print(grid[p][j]);
					if (grid[p][j] > 0) {
						sum++;
					} else {
						sum = 0;
					}
					if (sum > max)
						max = sum;
					p--;
					// } catch (ArrayIndexOutOfBoundsException e) {
					// System.err.println(String.format("i=%d:j=%d:p=%d:q=%d",
					// i, j, p, q));
					// }
				}
				// System.out.print("|");
			}
			// System.out.println("");
			// 対角線(左上->右下)
			for (int i = 0; i < 2 * n - 1; i++) {
				byte sum = 0;
				int p, q, r;
				if (i < n) {
					p = 0;
					q = n - i - 1;
					r = n;
				} else {
					p = i - n + 1;
					q = 0;
					r = 2 * n - i - 1;
				}
				for (int j = q; j < r; j++) {
					// try {//
					// System.out.print(grid[p][j]);//
					if (grid[p][j] > 0) {
						sum++;
					} else {
						sum = 0;
					}
					if (sum > max)
						max = sum;
					p++;
					// } catch (ArrayIndexOutOfBoundsException e) {//
					// System.err.println(String.format("i=%d:j=%d:p=%d:q=%d",//
					// i, j, p, q));//
					// }//
				}
				// System.out.print("|");//
			}
			// System.out.println();//
			System.out.println(max);
		}
	}
}