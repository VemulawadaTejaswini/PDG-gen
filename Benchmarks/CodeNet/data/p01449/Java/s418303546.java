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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int N = parseInt(br.readLine());
		Map<Integer, List<Integer>> G = new HashMap<>();

		for (int i = 1; i <= N; i++) {

			int p = parseInt(br.readLine());

			G.put(i, new ArrayList<Integer>());

			if (p == 0) {
				for (int j = 1; j <= 6; j++) {
					G.get(i).add(i + j < N ? i + j : N);
				}
			} else {
				G.get(i).add(i + p);
			}
		}

		//solve
		int min = INF;

		Deque<int[]> queue = new ArrayDeque<>();
		//Map<Integer, List<Integer>> visited = new HashMap();

		queue.offer(new int[]{1, 0});

		while (!queue.isEmpty()) {

			int[] s = queue.poll();

			if (s[0] == N) {
				min = Math.min(min, s[1]);
				continue;
			}

			if (G.get(s[0]).size() != 1) {
				for (int i : G.get(s[0])) {
					queue.add(new int[]{i, s[1] + 1});
				}
			} else {
				queue.add(new int[]{G.get(s[0]).get(0), s[1]});
			}
		}
		System.out.println(min);
	}
}