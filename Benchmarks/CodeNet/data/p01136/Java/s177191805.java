import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Gather the Maps!
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			BitSet[] day = new BitSet[31];
			Map<Integer, Set<Integer>> scd = new HashMap<>();

			for (int i = 0; i < day.length; i++) {
				day[i] = new BitSet(n);
			}

			for (int i = 0; i < n; i++) {

				StringTokenizer st = new StringTokenizer(br.readLine());

				int f = parseInt(st.nextToken());
				int[] fs = new int[f];

				for (int j = 0; j < f; j++) {
					int d = parseInt(st.nextToken());
					day[d].set(i);
					fs[j] = d;
				}
				//
				Arrays.sort(fs);
				for (int j = 0; j < fs.length - 1; j++) {
					scd.putIfAbsent(fs[j], new HashSet<>());
					for (int k = j + 1; k < fs.length; k++) {
						scd.get(fs[j]).add(fs[k]);
					}
				}
			}

			//solve
			int ans = -1;
			for (int i = 1; i <= 30; i++) {
				if (day[i].cardinality() == n) {
					ans = i;
					break;
				}
				if (!scd.containsKey(i)) {
					continue;
				}
				for (int j : scd.get(i)) {
					day[j].or(day[i]);
				}
			}
			System.out.println(ans);

		} //end while
	} //end main
}