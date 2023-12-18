import java.util.*;

/**
 * Problem C: Brave Princess Revisited
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int N, M, L;
			N = sc.nextInt();
			M = sc.nextInt();
			L = sc.nextInt();
			if ((N | M | L) == 0) break;

			Map<Integer, List<Edge>> G = new HashMap<>();

			for (int i = 0; i < M; i++) {
				int A, B, D, E;
				A = sc.nextInt();
				B = sc.nextInt();
				D = sc.nextInt();
				E = sc.nextInt();
				G.putIfAbsent(A, new ArrayList<>());
				G.putIfAbsent(B, new ArrayList<>());
				G.get(A).add(new Edge(B, D, E));
				G.get(B).add(new Edge(A, D, E));
			}

			//???????????¨ -> [?????´][????????????]
			int[][] D = new int[N + 1][L + 1];
			Queue<int[]> pq = new PriorityQueue<>((x, y) -> Integer.compare(x[2], y[2]));

			for (int i = 0; i < D.length; i++) Arrays.fill(D[i], INF);
			D[1][L] = 0;
			pq.offer(new int[]{1, L, 0});

			while (!pq.isEmpty()) {

				int s, l, min;
				s = pq.peek()[0];
				l = pq.peek()[1];
				min = pq.peek()[2];
				pq.poll();

				if (D[s][l] < min) continue;

				outer:
				for (Edge e : G.get(s)) {
					for (int i = 0; i <= L; i++) {
						if (D[e.to][i] > D[s][i] + e.enemy) {
							D[e.to][i] = D[s][i] + e.enemy;
							pq.offer(new int[]{e.to, i, D[e.to][i]});
						}
						if (i >= e.distance) {
							if (D[e.to][i - e.distance] > D[s][i]) {
								D[e.to][i - e.distance] = D[s][i];
								pq.offer(new int[]{e.to, i - e.distance, D[e.to][i - e.distance]});
							}
						}
					}
				}
			}

			int min = INF;

			for (int i = 0; i <= L; i++) {
				min = Math.min(min, D[N][i]);
			}

			System.out.println(min);
		}
	}
}

class Edge {

	int to, distance, enemy;

	public Edge(int to, int distance, int enemy) {
		this.to = to;
		this.distance = distance;
		this.enemy = enemy;
	}
}