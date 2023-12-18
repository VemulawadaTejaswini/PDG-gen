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
			int[] points_ = new int[MAX + 1];
			Arrays.fill(points_, -1);

			for (int i = 0; i < n; i++) {
				line = br.readLine();
				int x, y;
				x = parseInt(line.substring(0, line.indexOf(' ')));
				y = parseInt(line.substring(line.indexOf(' ') + 1));

				points[i][0] = x;
				points[i][1] = y;
				points_[x] = y;

			}

			//solve
			int max = 0;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {

					int p1x, p1y, p2x, p2y;
					p1x = points[i][0];
					p1y = points[i][1];
					p2x = points[j][0];
					p2y = points[j][1];

					//
					{
						int p3x, p3y, p4x, p4y;
						p3x = p1x - (p1y - p2y);
						p3y = p1y + (p1x - p2x);
						p4x = p2x - (p1y - p2y);
						p4y = p2y + (p1x - p2x);
						if ((p3x >= 0 && p3y >= 0 && p4x >= 0 && p4y >= 0)
								&& (p3x <= MAX && p3y <= MAX && p4x <= MAX && p4y <= MAX)) {
							if (points_[p3x] == p3y && points_[p4x] == p4y) {
								max = Math.max(max, (int) (Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2)));
							}
						}
					}

					//
					{
						int p3x, p3y, p4x, p4y;
						p3x = p1x + (p1y - p2y);
						p3y = p1y - (p1x - p2x);
						p4x = p2x + (p1y - p2y);
						p4y = p2y - (p1x - p2x);
						if ((p3x >= 0 && p3y >= 0 && p4x >= 0 && p4y >= 0)
								&& (p3x <= MAX && p3y <= MAX && p4x <= MAX && p4y <= MAX)) {
							if (points_[p3x] == p3y && points_[p4x] == p4y) {
								max = Math.max(max, (int) (Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2)));
							}
						}
					}
				}
			}
			System.out.println(max);
		}//end while
	}//end main
}