import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Trunk Road
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int H, W;
		H = parseInt(line.substring(0, line.indexOf(' ')));
		W = parseInt(line.substring(line.indexOf(' ') + 1));

		int[][] map = new int[H][W];

		for (int i = 0; i < H; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < W; j++) {
				map[i][j] = parseInt(st.nextToken());
			}
		}

		int ans = INF;

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++) {
				int sum = 0;
				for (int m = 0; m < H; m++) {
					for (int n = 0; n < W; n++) {
						sum += Math.min(Math.abs(i - m), Math.abs(j - n)) * map[m][n];
					}
				}
				ans = Math.min(ans, sum);
			}
		}

		System.out.println(ans);
	}
}
