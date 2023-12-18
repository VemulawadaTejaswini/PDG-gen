import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * The Oldest Site
 */
public class Main {

	static final int MAX = 5000;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[][] points = new int[n][2];
			boolean[][] grid = new boolean[MAX + 1][MAX + 1];
			
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));

				points[i][0] = x;
				points[i][1] = y;
				grid[y][x] = true;
			}

			//solve
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {

					int p1x, p1y, p2x, p2y, dx, dy;
					p1x = points[i][0];
					p1y = points[i][1];
					p2x = points[j][0];
					p2y = points[j][1];
					dx = p1x - p2x;
					dy = p1y - p2y;

					//
					{
						int p3x, p3y, p4x, p4y;
						p3x = p1x - dy;
						p3y = p1y + dx;
						p4x = p2x - dy;
						p4y = p2y + dx;
						if (0 <= p3x && p3x <= MAX
								&& 0 <= p3y && p3y <= MAX
								&& 0 <= p4x && p4x <= MAX
								&& 0 <= p4y && p4y <= MAX
								&& grid[p3y][p3x]
								&& grid[p4y][p4x]) {
							max = Math.max(max, dx * dx + dy * dy);
						}
					}

					//
					{
						int p3x, p3y, p4x, p4y;
						p3x = p1x + dy;
						p3y = p1y - dx;
						p4x = p2x + dy;
						p4y = p2y - dx;
						if (0 <= p3x && p3x <= MAX
								&& 0 <= p3y && p3y <= MAX
								&& 0 <= p4x && p4x <= MAX
								&& 0 <= p4y && p4y <= MAX
								&& grid[p3y][p3x]
								&& grid[p4y][p4x]) {
							max = Math.max(max, dx * dx + dy * dy);
						}
					}
				}
			}
			System.out.println(max);
		}//end while
	}//end main
}