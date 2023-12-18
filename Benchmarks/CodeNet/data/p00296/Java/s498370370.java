import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/**
 * Baton Relay Game
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			int N = Integer.parseInt(st.nextToken());

			Deque<Integer> relays = new ArrayDeque<Integer>();
			Deque<Integer> duties = new ArrayDeque<Integer>();

			for (int i = 0; i < N; i++) {
				relays.offer(i);
			}

			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int a = Integer.parseInt(st.nextToken());
				if (a % 2 == 0) {
					for (int i = 0; i < a; i++) {
						relays.offer(relays.poll());
					}
				} else {
					for (int i = 0; i < a; i++) {
						relays.offerFirst(relays.pollLast());
					}
				}
				duties.offer(relays.pollFirst());
			}

			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int q = Integer.parseInt(st.nextToken());
				System.out.println(duties.contains(q) ? 0 : 1);
			}

		} // end while
	} // end main
}