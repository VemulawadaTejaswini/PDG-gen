import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Princess in Danger
 */
public class Main {

	static final int INF = 1 << 29;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		StringTokenizer st;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			st = new StringTokenizer(line);

			int N, M, _L, K, A, H;
			boolean[] L;
			Map<Integer, List<Edge>> G;
			int[][] D;      //????????????: [????±???????][?????????????????????????????????]

			N = parseInt(st.nextToken());   //N: ????????°
			M = parseInt(st.nextToken());   //M: ???????????????????????§?????¶?????????
			_L = parseInt(st.nextToken());  //_L: ??????????¨??????????????????°
			K = parseInt(st.nextToken());   //K: ?????¨????????´??\?????¶???????????°
			A = parseInt(st.nextToken());   //A: ??¬?????????????????¨?????????
			H = parseInt(st.nextToken());   //H: ????§??§??????¬?????????????????¢?????????????????????
			if ((N | M | _L | K | A | H) == 0) break;

			//
			L = new boolean[N];
			L[A] = L[H] = true;

			if (_L > 0) {
				st = new StringTokenizer(br.readLine());
				for (int i = 0; i < _L; i++) {
					L[parseInt(st.nextToken())] = true;
				}
			}

			//
			G = new HashMap<>();

			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				if (!st.hasMoreTokens()) {
					st = new StringTokenizer(br.readLine());
				}
				int X, Y, T;
				X = parseInt(st.nextToken());
				Y = parseInt(st.nextToken());
				T = parseInt(st.nextToken());
				G.putIfAbsent(X, new ArrayList<>());
				G.putIfAbsent(Y, new ArrayList<>());
				G.get(X).add(new Edge(Y, T));
				G.get(Y).add(new Edge(X, T));
			}

			//
			D = new int[N][M + 1];
			for (int i = 0; i < N; i++) Arrays.fill(D[i], INF);
			D[A][M] = 0;

			Queue<P> pq = new PriorityQueue<>();
			pq.offer(new P(A, 0, M));

			//
			while (!pq.isEmpty()) {

				P p = pq.poll();

				if (D[p.to][p.stime] < p.ctime) continue;

				int v, s;
				v = p.to;
				s = p.stime;

				if (v == H) break;

				if (G.containsKey(v)) {
					for (Edge e : G.get(v)) {
						if (M >= e.time) {
							int m = (L[v] ? M - s : 0);
							for (int i = 0; i <= m; i++) {
								int ctime, stime;
								ctime = D[v][s] + e.time + i;
								stime = (s + i) - e.time;
								if (stime >= 0
										&& D[e.to][stime] > ctime) {
									D[e.to][stime] = ctime;
									pq.offer(new P(e.to, ctime, stime));
								}
							}
						}
					}
				}
			}

			//
			int ans = INF;

			for (int i = 0; i <= M; i++) ans = Math.min(ans, D[H][i]);

			System.out.println(ans != INF ? ans : "Help!");
		}
	}
}

class Edge {

	int to, time;

	public Edge(int to, int time) {
		this.to = to;
		this.time = time;
	}
}

class P implements Comparable<P> {

	int to, ctime, stime;

	public P(int to, int ctime, int stime) {
		this.to = to;
		this.ctime = ctime;
		this.stime = stime;
	}

	@Override
	public int compareTo(P o) {
		return Integer.compare(ctime, o.ctime);
	}
}