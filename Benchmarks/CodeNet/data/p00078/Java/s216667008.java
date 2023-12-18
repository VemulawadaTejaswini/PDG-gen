import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Magic Square
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0")) {

			int n = Integer.parseInt(line);
			MagicSquare square = new MagicSquare(n);
			System.out.print(square.toString());
		}
	}

}

class MagicSquare {
	private int n;
	private int[][] square;

	MagicSquare(int n) {
		this.n = n;
		square = new int[n][n];
		generate();
	}

	private void generate() {
		int max = n * n + 1;
		Index idx = null;
		for (int i = 1; i < max; i++) {
			if (i == 1) {
				idx = first();
			} else {
				idx = next(idx);
			}
			setValue(i, idx);
		}
	}

	private Index first() {
		int x = n / 2 + 1;
		int y = n / 2;
		return new Index(x, y);
	}

	private Index next(Index idx) {
		int nx = idx.x + 1;
		int ny = idx.y + 1;
		Index next = new Index(nx, ny);
		correct(next);
		return next;
	}

	private void correct(Index idx) {

		int x, y;
		x = idx.x;
		y = idx.y;

		if (0 <= x && x < n && 0 <= y && y < n) {
			if (square[x][y] == 0) {
				return;
			} else {
				++idx.x;
				--idx.y;
			}
		} else {
			if (x >= n) { // 下
				idx.x = 0;
			} else if (y >= n) {// 右
				idx.y = 0;
			} else if (y < 0) {// 左
				idx.y = n - 1;
			}
		}
		correct(idx);
	}

	private void setValue(int value, Index idx) {
		square[idx.x][idx.y] = value;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				sb.append(String.format("%-4d", square[i][j]));
				if (j == n - 1) {
					sb.append("\n");
				}
			}
		}
		return sb.toString();
	}
}

class Index {
	int x, y;

	Index(int x, int y) {
		this.x = x;
		this.y = y;
	}
}