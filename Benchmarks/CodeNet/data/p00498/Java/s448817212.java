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
	static ArrayList<Query> query = new ArrayList<Query>();
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
		for (int i = 0; i < Q; ++i) {
			int S = Integer.parseInt(sc.next()) - 1;
			int T = Integer.parseInt(sc.next()) - 1;
			query.add(new Query(S, T, i));
		}
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
		int start = 0;
		int step = (int) Math.ceil(Math.sqrt(N));
		while (start + step < end) {
			UnionFind ufPrev = new UnionFind(uf);
			boolean[] usedPrev = used.clone();
			for (int i = start; i < start + step; ++i) {
				int node = ord.get(i);
				for (Edge e : next.get(node)) {
					if (used[e.to]) {
						uf.union(node, e.to);
					}
				}
				used[node] = true;
			}
			ArrayList<Query> cur = new ArrayList<Query>();
			ArrayList<Query> next = new ArrayList<Query>();
			for (Query q : query) {
				if (uf.find(q.s, q.t)) {
					cur.add(q);
				} else {
					next.add(q);
				}
			}
			determine(cur, ufPrev, usedPrev, start, start + step);
			query = next;
			start += step;
			System.gc();
		}
		determine(query, uf, used, start, end);
	}

	static void determine(ArrayList<Query> qs, UnionFind uf, boolean[] used, int start, int end) {
		for (int i = start; i < end; ++i) {
			ArrayList<Query> nqs = new ArrayList<Query>();
			int node = ord.get(i);
			for (Edge e : next.get(node)) {
				if (used[e.to]) {
					uf.union(node, e.to);
				}
			}
			used[node] = true;
			for (Query q : qs) {
				if (uf.find(q.s, q.t)) {
					ans[q.idx] = dist[node];
				} else {
					nqs.add(q);
				}
			}
			qs = nqs;
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