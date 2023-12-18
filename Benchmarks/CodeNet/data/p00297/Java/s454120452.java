import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Star Watching
 * PCK2014 ??????8
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int N = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int d = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			Map<Integer, int[]> stars = new HashMap<>();//[top,buttom,rigth,left]

			for (int i = 0; i < N; i++) {
				words = br.readLine().split(" ");

				int x, y, b;
				x = parseInt(words[0]);
				y = parseInt(words[1]);
				b = parseInt(words[2]);

				if (!stars.containsKey(b)) {
					stars.put(b, new int[]{y, y, x, x});
				} else {
					if (y > stars.get(b)[0]) {
						stars.get(b)[0] = y;
					} else if (y < stars.get(b)[1]) {
						stars.get(b)[1] = y;
					}
					if (x > stars.get(b)[2]) {
						stars.get(b)[2] = x;
					} else if (x < stars.get(b)[3]) {
						stars.get(b)[3] = x;
					}
				}
			}

			List<Integer> brights = new ArrayList<>(stars.keySet());
			Collections.sort(brights);

			int max = -1;
			for (int i = 0, j = 0; i < brights.size(); i++) {
				while (j < brights.size() && brights.get(j) - brights.get(i) <= d) j++;
				j--;

				int s, t;
				s = brights.get(i);
				t = brights.get(j);
				max = Math.max(max,
						(Math.max(stars.get(s)[0], stars.get(t)[0]) - Math.min(stars.get(s)[1], stars.get(t)[1]))
								* (Math.max(stars.get(s)[2], stars.get(t)[2]) - Math.min(stars.get(s)[3], stars.get(t)[3]))
				);
			}
			System.out.println(max);
		} // end while
	} // end main
}