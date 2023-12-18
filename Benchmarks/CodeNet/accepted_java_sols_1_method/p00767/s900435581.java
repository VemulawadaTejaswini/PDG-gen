/**
 * Integral Rectangles
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;

public class Main {

	static final Map<Integer, List<int[]>> rect = new HashMap<Integer, List<int[]>>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		for (int i = 1; i < 150; i++) {
			for (int j = i + 1; j < 151; j++) {
				int d = i * i + j * j;
				if (!rect.containsKey(d)) {
					rect.put(d, new ArrayList<int[]>());
				}
				rect.get(d).add(new int[]{i, j});
			}
		}

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int h = parseInt(line.substring(0, line.indexOf(' ')));
			int w = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((h | w) == 0) break;

			int d = h * h + w * w;

			int[] ans = null;
			outer:
			for (int i = d; ; i++) {
				if (!rect.containsKey(i)) {
					continue;
				}
				for (int[] r : rect.get(i)) {
					if (i > d) {
						ans = r;
						break outer;
					}
					if (r[0] > h) {
						ans = r;
						break outer;
					}
				}
			}
			System.out.println(ans[0] + " " + ans[1]);
		}
	} //end while
} //end main