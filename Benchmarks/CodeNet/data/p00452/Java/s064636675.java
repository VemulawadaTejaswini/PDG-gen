import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Darts
 * JOI 2008 ??¬???3
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int N, M;

			N = parseInt(line.substring(0, line.indexOf(' ')));
			M = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((N | M) == 0) break;

			//
			int[] Pa = new int[N + 1];
			NavigableSet<Integer> Pt = new TreeSet<>();
			Pt.add(0);
			for (int i = 1; i <= N; i++) {
				Pt.add(parseInt(br.readLine()));
			}
			int _i = 0;
			for (int p : Pt) {
				Pa[_i] = p;
				_i++;
			}

			//solve
			int max = 0;
			for (int i = Pa.length - 1; i >= 0; i--) {
				if (Pa[i] > M) continue;
				if (Pa[i] * 4 <= M) {
					max = Math.max(max, Pa[i] * 4);
					break;
				}
				//
				int p = Pa[i];
				int _M = M - p, _max = p, c = 1;
				do {
					p = Pt.floor(_M);
					_M -= p;
					_max += p;
					c++;
				} while (p != 0 && c < 4);
				max = Math.max(max, _max);
			}
			System.out.println(max);
		}
	}//end main
}