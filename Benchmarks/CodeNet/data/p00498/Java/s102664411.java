import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M, K, Q;
	static ArrayList<ArrayList<Edge>> next = new ArrayList<ArrayList<Edge>>();
	static int[] dist;
	static int[] fest;
	static ArrayList<Integer> ord = new ArrayList<Integer>();
	//	static ArrayList<Query> query = new ArrayList<Query>();
	static Query[] query, queryBuf1, queryBuf2;
	static int qSize, qbufSize1, qbufSize2;
	static int[] ans;

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		Q = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			next.add(new ArrayList<Edge>());
		}
		for (int i = 0; i < M; ++i) {
			int A = Integer.parseInt(sc.next()) - 1;
			int B = Integer.parseInt(sc.next()) - 1;
			int L = Integer.parseInt(sc.next());
			next.get(A).add(new Edge(B, L));
			next.get(B).add(new Edge(A, L));
		}
		fest = new int[K];
		for (int i = 0; i < K; ++i) {
			fest[i] = Integer.parseInt(sc.next()) - 1;
		}
		query = new Query[Q];
		for (int i = 0; i < Q; ++i) {
			int S = Integer.parseInt(sc.next()) - 1;
			int T = Integer.parseInt(sc.next()) - 1;
			query[i] = new Query(S, T, i);
		}
		qSize = Q;
		queryBuf1 = new Query[Q];
		queryBuf2 = new Query[Q];
		ans = new int[Q];
		shortestPath();
		solve();
		for (int i = 0; i < Q; ++i) {
			System.out.println(ans[i]);
		}
	}

	static void solve() {
		for (int i = 0; i < N; ++i) {
			ord.add(i);
		}
		Collections.sort(ord, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return dist[o2] - dist[o1];
			}
		});
		int end = N;
		while (end > 0 && dist[ord.get(end - 1)] == 0) {
			--end;
		}
		boolean[] used = new boolean[N];
		UnionFind uf = new UnionFind(N);
		boolean[] usedPrev = new boolean[N];
		UnionFind ufPrev = new UnionFind(N);
		int start = 0;
		int step = (int) Math.ceil(Math.sqrt(N));
		while (start + step < end) {
			System.arraycopy(uf.set, 0, ufPrev.set, 0, N);
			System.arraycopy(used, 0, usedPrev, 0, N);
			for (int i = start; i < start + step; ++i) {
				int node = ord.get(i);
				for (Edge e : next.get(node)) {
					if (used[e.to]) {
						uf.union(node, e.to);
					}
				}
				used[node] = true;
			}
			qbufSize1 = qbufSize2 = 0;
			for (int i = 0; i < qSize; ++i) {
				Query q = query[i];
				if (uf.find(q.s, q.t)) {
					queryBuf1[qbufSize1++] = q;
				} else {
					queryBuf2[qbufSize2++] = q;
				}
			}
			determine(ufPrev, usedPrev, start, start + step);
			for (int i = 0; i < qbufSize2; ++i) {
				query[i] = queryBuf2[i];
			}
			qSize = qbufSize2;
			start += step;
		}
		for (int i = 0; i < qSize; ++i) {
			queryBuf1[i] = query[i];
		}
		qbufSize1 = qSize;
		determine(uf, used, start, end);
	}

	static void determine(UnionFind uf, boolean[] used, int start, int end) {
		for (int i = start; i < end; ++i) {
			int size = 0;
			int node = ord.get(i);
			for (Edge e : next.get(node)) {
				if (used[e.to]) {
					uf.union(node, e.to);
				}
			}
			used[node] = true;
			for (int j = 0; j < qbufSize1; ++j) {
				Query q = queryBuf1[j];
				if (uf.find(q.s, q.t)) {
					ans[q.idx] = dist[node];
				} else {
					query[size++] = q;
				}
			}
			for (int j = 0; j < size; ++j) {
				queryBuf1[j] = query[j];
			}
			qbufSize1 = size;
		}
	}

	static void shortestPath() {
		dist = new int[N];
		PriorityQueue<State> que = new PriorityQueue<State>();
		boolean[] visited = new boolean[N];
		for (int i = 0; i < K; ++i) {
			que.add(new State(fest[i], 0));
		}
		while (!que.isEmpty()) {
			State cur = que.poll();
			if (visited[cur.pos]) continue;
			visited[cur.pos] = true;
			dist[cur.pos] = cur.cost;
			for (Edge e : next.get(cur.pos)) {
				if (visited[e.to]) continue;
				que.add(new State(e.to, cur.cost + e.cost));
			}
		}
	}

	static class State implements Comparable<State> {
		int pos, cost;

		public State(int pos, int cost) {
			this.pos = pos;
			this.cost = cost;
		}

		public int compareTo(State o) {
			return this.cost - o.cost;
		}
	}

	static class Edge {
		int to;
		int cost;

		Edge(int to, int cost) {
			this.to = to;
			this.cost = cost;
		}
	}

	static class Query {
		int s, t, idx;

		public Query(int s, int t, int idx) {
			this.s = s;
			this.t = t;
			this.idx = idx;
		}
	}

	static class UnionFind {
		int[] set;

		UnionFind(int n) {
			set = new int[n];
			Arrays.fill(set, -1);
		}

		UnionFind(UnionFind o) {
			set = o.set.clone();
		}

		void union(int a, int b) {
			int rtA = root(a);
			int rtb = root(b);
			if (rtA == rtb) {
				return;
			}
			set[rtA] += set[rtb];
			set[rtb] = rtA;
		}

		boolean find(int a, int b) {
			return root(a) == root(b);
		}

		int root(int a) {
			if (set[a] < 0) {
				return a;
			} else {
				set[a] = root(set[a]);
				return set[a];
			}
		}

		int size(int a) {
			return -set[root(a)];
		}
	}

}