import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Property Distribution
 */
public class Main {

	static char DISTRIBUTED = '\0';
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {

			int h = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int w = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			// read in.
			char[][] prop = new char[h + 2][w + 2];
			for (int i = 1; i < h + 1; ++i) {
				line = br.readLine();
				for (int j = 1; j < w + 1; ++j) {
					prop[i][j] = line.charAt(j - 1);
				}
			}

			// solve
			count = 0;
			for (int i = 1; i < h + 1; ++i) {
				for (int j = 1; j < w + 1; ++j) {
					if (prop[i][j] != DISTRIBUTED) {
						++count;
						distribute(prop, prop[i][j], i, j);
					}
				}
			}

			// print
			System.out.println(count);
		}
	}

	static void distribute(char[][] prop, char fruit, int x, int y) {

		final int V[] = { 1, -1, 0, 0 };
		final int H[] = { 0, 0, 1, -1 };

		if (prop[x][y] != DISTRIBUTED) {

			prop[x][y] = DISTRIBUTED;

			for (int i = 0; i < 4; ++i) {
				int xv, yh;
				xv = x + V[i];
				yh = y + H[i];
				if (prop[xv][yh] == fruit) {
					distribute(prop, fruit, xv, yh);
				}
			}
		}
	}
}