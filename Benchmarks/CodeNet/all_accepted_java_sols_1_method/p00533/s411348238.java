import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Weather Forecaster
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		line = br.readLine();
		int H, W;
		H = parseInt(line.substring(0, line.indexOf(' ')));
		W = parseInt(line.substring(line.indexOf(' ') + 1));

		int[][] forecast = new int[H][W];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < H; i++) {
			line = br.readLine();
			for (int j = 0; j < W; j++) {
				if (line.charAt(j) == 'c') {
					forecast[i][j] = 0;
				} else {
					if (j == 0) {
						forecast[i][j] = -1;
					} else {
						if (forecast[i][j - 1] == -1) {
							forecast[i][j] = -1;
						} else {
							forecast[i][j] = forecast[i][j - 1] + 1;
						}
					}
				}
				if (j == 0) {
					sb.append(forecast[i][j]);
				} else {
					sb.append(" " + forecast[i][j]);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}