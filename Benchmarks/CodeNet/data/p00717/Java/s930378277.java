import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Polygonal Line Search
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[][] arc0 = null;
			int[][] rev0 = null;

			for (int i = 0; i <= n; i++) {

				int m = parseInt(br.readLine());

				int[][] arc = new int[m][2];

				for (int j = 0; j < m; j++) {
					line = br.readLine();
					arc[j][0] = parseInt(line.substring(0, line.indexOf(' ')));
					arc[j][1] = parseInt(line.substring(line.indexOf(' ') + 1));
				}

				arc = normalize(arc);

				if (i == 0) {
					arc0 = arc;
					rev0 = normalize(reverse(arc0));
				} else {
					for (int j = 0; j < 4; j++) {
						if (congruent(arc0, arc) || congruent(rev0, arc)) {
							System.out.println(i);
							break;
						} else {
							arc = rotate(arc);
						}
					}
				}
			}

			System.out.println("*****");
		}

	}//end main

	static int[][] reverse(int[][] a) {

		int[][] ret = new int[a.length][a[0].length];

		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			ret[i][0] = a[j][0];
			ret[i][1] = a[j][1];
		}

		return ret;
	}

	static int[][] normalize(int[][] a) {

		int[][] ret = new int[a.length][a[0].length];

		int dx, dy;
		dx = -a[0][0];
		dy = -a[0][1];

		for (int i = 0; i < a.length; i++) {
			ret[i][0] = a[i][0] + dx;
			ret[i][1] = a[i][1] + dy;
		}

		return ret;
	}

	static int[][] rotate(int[][] a) {

		int[][] ret = new int[a.length][a[0].length];

		for (int i = 0; i < a.length; i++) {
			ret[i][0] = -a[i][1];
			ret[i][1] = a[i][0];
		}

		return ret;
	}

	static boolean congruent(int[][] a1, int[][] a2) {

		boolean ret = true;

		for (int i = 0; i < a1.length; i++) {
			ret &= (a1[i][0] == a2[i][0] && a1[i][1] == a2[i][1]);
			if (!ret) break;
		}

		return ret;
	}
}