import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Surf Smelt Fishing Contest II
 */
public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			HashMap<Integer, int[]> anglers = new HashMap<Integer, int[]>();
			PriorityQueue<int[]> queue = new PriorityQueue<int[]>(1,
					new Comparator<int[]>() {
						@Override
						public int compare(int[] o1, int[] o2) {
							if (o1[1] == o2[1]) {
								return o1[0] - o2[0];
							} else {
								return o2[1] - o1[1];
							}
						}
					});

			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int q = Integer.parseInt(line.substring(line.indexOf(' ') + 1));

			for (int i = 0; i < q; i++) {
				line = br.readLine();
				int a = Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int v = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
				if (!anglers.containsKey(a)) {
					anglers.put(a, new int[] { a, v });
					queue.offer(anglers.get(a));
				} else {
					anglers.get(a)[1] += v;
					queue.offer(queue.poll());// 再構築
				}
				System.out.println(queue.peek()[0] + " " + queue.peek()[1]);
			}

		}

	}
	
}