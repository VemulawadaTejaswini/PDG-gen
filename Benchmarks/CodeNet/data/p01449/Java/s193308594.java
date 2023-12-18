import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Space-Time Sugoroku Road
 */
public class Main {

	static final int INF = 1 << 29;
	static int min = INF;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		int N = parseInt(br.readLine());
		Map<Integer, List<Integer>> G = new HashMap<>();

		for (int i = 1; i <= N; i++) {

			int p = parseInt(br.readLine());

			G.put(i, new ArrayList<>());

			if (p == 0) {
				for (int j = 1; j <= 6; j++) {
					G.get(i).add(i + j < N ? i + j : N);
				}
			} else {
				G.get(i).add(i + p);
			}
		}

		//solve
		Queue<int[]> pq = new PriorityQueue<>(1, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		Log loop = main.new Log();

		pq.offer(new int[]{1, 0});

		while (!pq.isEmpty()) {

			int[] s = pq.poll();

			if (s[0] == N) {
				min = Math.min(min, s[1]);
				continue;
			}

			if (s[1] >= min) {
				continue;
			}

			if (G.get(s[0]).size() != 1) {
				for (int t : G.get(s[0])) {
					if (!loop.detect(s[0], t, s[1] + 1)) {
						pq.add(new int[]{t, s[1] + 1});
					}
				}
			} else {
				int t = G.get(s[0]).get(0);
				if (!loop.detect(s[0], t, s[1])) {
					pq.add(new int[]{t, s[1]});
				}
			}
		}
		System.out.println(min);
	}

	class Log {

		Map<Integer, Map<Integer, Integer>> data;

		Log() {
			data = new HashMap<>();
		}

		boolean detect(int s, int t, int c) {

			data.putIfAbsent(s, new HashMap<>());
			data.get(s).putIfAbsent(t, INF);

			if (c < data.get(s).get(t)) {
				data.get(s).put(t, c);
				return false;
			} else {
				return true;
			}
		}
	}
}