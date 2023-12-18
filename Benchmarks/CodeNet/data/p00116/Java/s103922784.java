import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Rectangular Searching
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while (!(line = br.readLine()).equals("0 0")) {
			int h = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int w = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			// read grid and count (create histogram)
			int[][] g = new int[h][w + 1];
			for (int i = 0; i < h; i++) {
				line = br.readLine();
				for (int j = 0; j < w + 1; j++) {
					if (j < w) {
						g[i][j] = line.toCharArray()[j] == '*' ? 0 : 1;
						if (i > 0 && g[i][j] != 0) {
							g[i][j] += g[i - 1][j];
						}
					} else {
						g[i][j] = 0;
					}
				}
			}

			// search
			int area = 0;
			Deque<int[]> queue = new ArrayDeque<int[]>();
			for (int i = 0; i < h; i++) {
				queue.push(new int[] { 0, g[i][0] });
				for (int j = 1; j < w + 1; j++) {
					if (g[i][j] > queue.peek()[1]) {
						queue.push(new int[] { j, g[i][j] });
					} else if (g[i][j] < queue.peek()[1]) {
						int[] prev = null;
						while (!queue.isEmpty() && g[i][j] <= queue.peek()[1]) {
							prev = queue.pop();
							area = Math.max(area, prev[1] * (j - prev[0]));
						}
						queue.push(new int[] { prev[0], g[i][j] });
					}
				}
			}
			System.out.println(area);
		}
	}
}