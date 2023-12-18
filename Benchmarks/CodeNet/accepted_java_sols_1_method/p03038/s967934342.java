import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Long> pq = new PriorityQueue<Long>(N);
		for (int i = 0; i < N; i++) {
			pq.add(sc.nextLong());
		}
		Map<Long, Integer> tm = new TreeMap<Long, Integer>(Collections.reverseOrder());
		for (int i = 0; i < M; i++) {
			int b = sc.nextInt();
			long c = sc.nextLong();
			// treeMapに値を入れる
			if (tm.containsKey(c)) {
				int prev = tm.get(c);
				tm.put(c, prev + b);
			} else {
				tm.put(c, b);
			}
		}
		sc.close();

		tm.forEach((k, v) -> {
			int cnt = 0;
			while (true) {
				if (k > pq.peek()) {
					pq.poll();
					pq.add(k);

					cnt++;
					if (cnt == v) {
						return;
					}
				} else {
					break;
				}
			}
		});

		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += pq.poll();
		}
		System.out.println(ans);
	}
}
