/**
 * Analyzing Login/Logout Records
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class P1148 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while (!(line = br.readLine()).equals("0 0")) {

			// record logs.
			Map<Integer, List<int[]>> log = new HashMap<Integer, List<int[]>>();
			StringTokenizer st;

			int r = parseInt(br.readLine());
			for (int i = 0; i < r; i++) {
				st = new StringTokenizer(br.readLine());
				int t, n, m, s;
				t = parseInt(st.nextToken());
				n = parseInt(st.nextToken());//not use
				m = parseInt(st.nextToken());
				s = parseInt(st.nextToken());
				if (!log.containsKey(m)) {
					log.put(m, new ArrayList<int[]>());
				}
				log.get(m).add(new int[]{t, s == 1 ? 1 : -1});
			}

			// answer
			int q = parseInt(br.readLine());
			for (int i = 0; i < q; i++) {
				st = new StringTokenizer(br.readLine());
				int ts, te, m;
				ts = parseInt(st.nextToken());
				te = parseInt(st.nextToken());
				m = parseInt(st.nextToken());
				int login = 0, total = 0;
				if (log.containsKey(m)) {
					for (int[] t : log.get(m)) {
						login += t[1];
						if (t[0] <= ts) {
							total = login > 0 ? te - ts : 0;
						} else if (ts < t[0] && t[0] < te) {
							if (t[1] == 1 && login == 1) {
								total += te - t[0];
							}
							if (t[1] == -1 && login == 0) {
								total -= te - t[0];
							}
						} else {
							break;
						}
					}
				}
				System.out.println(total);
			}
		}//end while
	}//end main
}