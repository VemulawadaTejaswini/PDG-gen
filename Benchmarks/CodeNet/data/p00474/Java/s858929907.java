import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Icicles
 */
public class Main {

	static Main main = new Main();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int l = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			Icicle[] icicles = new Icicle[n + 2];
			Queue<Icicle> growths = new PriorityQueue<Icicle>(1,
					new Comparator<Icicle>() {
						@Override
						public int compare(Icicle o1, Icicle o2) {
							return o2.length - o1.length;
						}
					});

			// read
			icicles[0] = main.new Icicle(0);
			for (int i = 1; i < n + 1; i++) {
				icicles[i] = main.new Icicle(Integer.parseInt(br.readLine()));
			}
			icicles[n + 1] = main.new Icicle(0);

			// solve

			int total = 0;
			while (true) {

				for (int i = 1; i < n + 1; i++) {
					if (!icicles[i].queued
							&& icicles[i].length > icicles[i - 1].length
							&& icicles[i].length > icicles[i + 1].length) {
						icicles[i].queued = true;
						growths.offer(icicles[i]);
					}
				}

				if (growths.isEmpty()) {
					break;
				}

				//
				int elapse = l - growths.peek().length;
				total += elapse;

				while (!growths.isEmpty()) {
					if (growths.peek().length + elapse == l) {
						growths.peek().length = 0;
						growths.poll();
					} else {
						break;
					}
				}

				for (Icicle i : growths) {
					i.length += elapse;
				}

			}
			System.out.println(total);
		}
	}

	class Icicle {
		int length;
		boolean queued = false;

		Icicle(int length) {
			this.length = length;
		}
	}
}