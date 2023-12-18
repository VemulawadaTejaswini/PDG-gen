import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Surf Smelt Fishing Contest II
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		P0099 main = new P0099();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			Angler[] anglers = new Angler[n + 1];
			for (int i = 1; i <= n; i++) {
				anglers[i] = main.new Angler(i);
			}

			Queue<Angler> pq = new PriorityQueue<>(new Comparator<Angler>() {
				@Override
				public int compare(Angler o1, Angler o2) {
					if (o1.catch_ == o2.catch_) {
						return Integer.compare(o1.id, o2.id);
					} else {
						return Integer.compare(o2.catch_, o1.catch_);
					}
				}
			});

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < q; i++) {
				line = br.readLine();
				int a, v;
				a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				v = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

				pq.remove(anglers[a]);
				anglers[a].catch_ += v;
				pq.add(anglers[a]);
				//
				sb.append(pq.peek().id + " " + pq.peek().catch_ + "\n");
			}
			System.out.print(sb.toString());

		} //end while
	} //end main

	class Angler {
		int id;
		int catch_ = 0;

		Angler(int id) {
			this.id = id;
		}
	}
}