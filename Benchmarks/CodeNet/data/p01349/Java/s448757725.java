import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

	int H, W, N;
	char[][] field;
	char[][] newField;

	public void loop() {
		while (true) {
			for (int i = H - 1; i >= 0; i--) {
				for (int j = 0; j < W; j++) {
					if (newField[i][j] == '.')
						continue;
					int down = 1;
					while (i + down < H && newField[i + down][j] == '.') {
						down++;
					}

					newField[i + down - 1][j] = newField[i][j];

					if (down != 1) {
						newField[i][j] = '.';
					}
				}
			}


			boolean[][] delete = new boolean[H][W];
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					if (newField[i][j] == '.')
						continue;

					int up = 1;
					int down = 1;
					int left = 1;
					int right = 1;

					while (i + down < H
							&& newField[i][j] == newField[i + down][j]) {
						down++;
					}

					while (i - up >= 0 && newField[i][j] == newField[i - up][j]) {
						up++;
					}

					while (j + right < W
							&& newField[i][j] == newField[i][j + right]) {
						right++;
					}

					while (j - left >= 0
							&& newField[i][j] == newField[i][j - left]) {
						left++;
					}

					up--;
					down--;
					left--;
					right--;

					if (up + down + 1 >= N || left + right + 1 >= N) {
						delete[i][j] = true;
						if (up + down + 1 >= N) {
							for (int k = i + 1; k <= i + down; k++) {
								delete[k][j] = true;
							}

							for (int k = i - 1; k >= i - up; k--) {
								delete[k][j] = true;
							}
						}

						if (left + right + 1 >= N) {
							for (int k = j + 1; k <= j + right; k++) {
								delete[i][k] = true;
							}

							for (int k = j - 1; k >= j - left; k--) {
								delete[i][k] = true;
							}
						}
					}
				}
			}

			for(int i = 0;i < H;i++){
				for(int j = 0;j < W;j++){
					if(delete[i][j])
						newField[i][j] = '.';
				}
			}

			boolean flag = true;

			for (int i = H - 1; i >= 0; i--) {
				for (int j = 0; j < W; j++) {
					if (newField[i][j] == '.')
						continue;
					int down = 1;
					while (i + down < H && newField[i + down][j] == '.') {
						down++;
					}

					newField[i + down - 1][j] = newField[i][j];

					if (down != 1) {
						newField[i][j] = '.';
						flag = false;
					}
				}
			}

			if (flag) {
				return;
			}
		}
	}

	public void solve() {
		H = nextInt();
		W = nextInt();
		N = nextInt();
		field = new char[H][W];
		for (int i = 0; i < H; i++) {
			field[i] = next().toCharArray();
		}

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W - 1; j++) {
				if (field[i][j] == field[i][j + 1])
					continue;
				newField = new char[H][W];
				for (int k = 0; k < H; k++) {
					newField[k] = Arrays.copyOf(field[k], W);
				}

				char tmp = newField[i][j];
				newField[i][j] = newField[i][j + 1];
				newField[i][j + 1] = tmp;

				loop();

				boolean clear = true;

				for (int y = 0; y < H; y++) {
					for (int x = 0; x < W; x++) {
						if (newField[y][x] == '.')
							continue;
						clear = false;
						break;
					}
					if (!clear)
						break;
				}

				if (clear) {
					//out.println(i + " " + j);
					out.println("YES");
					return;
				}
			}
		}
		out.println("NO");
	}

	public static void main(String[] args) {
		out.flush();
		new Main().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}