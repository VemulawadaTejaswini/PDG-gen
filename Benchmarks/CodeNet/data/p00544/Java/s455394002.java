import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Russian Flag
 */
public class Main {

	static final int W = 0;
	static final int B = 1;
	static final int R = 2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();

		int N, M;
		N = parseInt(line.substring(0, line.indexOf(' ')));
		M = parseInt(line.substring(line.indexOf(' ') + 1));
		int[][] wbr = new int[N][3];

		for (int i = 0; i < N; i++) {
			line = br.readLine();
			for (char c : line.toCharArray()) {
				switch (c) {
					case 'W':
						wbr[i][B]++;
						wbr[i][R]++;
						break;
					case 'B':
						wbr[i][W]++;
						wbr[i][R]++;
						break;
					case 'R':
						wbr[i][W]++;
						wbr[i][B]++;
						break;
				}
			}
		}

		int min = N * M;
		for (int i = 1; i < N - 1; i++) {
			for (int j = i; j < N - 1; j++) {
				int change = 0;
				for (int k = 1; k < N - 1; k++) {
					if (k < i) {
						change += wbr[k][W];
					} else if (i <= k && k <= j) {
						change += wbr[k][B];
					} else {
						change += wbr[k][R];
					}
				}
				min = Math.min(min, change);
			}
		}

		System.out.println(wbr[0][W] + min + wbr[N - 1][R]);
	}
}