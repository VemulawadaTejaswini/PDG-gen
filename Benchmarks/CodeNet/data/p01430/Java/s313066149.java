import java.util.*;

import java.io.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);

	int n, e, q;

	LinkedList<Edge>[] g;

	int flow;

	boolean used[];



	int INF = Integer.MAX_VALUE >> 4;



	void run() {



		n = sc.nextInt();

		e = sc.nextInt();

		q = sc.nextInt();

		n++;



		g = new LinkedList[n];

		used = new boolean[n];

		for (int i = 0; i < n; i++) {



			g[i] = new LinkedList<Edge>();

		}



		for (int i = 0; i < e; i++) {



			int a = sc.nextInt();

			int b = sc.nextInt();

			add(Math.min(a, b), Math.max(a, b));

		}



		flow = 0;

		max_frow(1, n - 1);



		for (int i = 0; i < q; i++) {



			if (sc.nextInt() == 1) {



				int a = sc.nextInt();

				int b = sc.nextInt();

				add(Math.min(a, b), Math.max(a, b));

				max_frow_c1(1, n - 1);

			} else {



				remove(sc.nextInt(), sc.nextInt());

			}



			System.out.println(flow);

		}

	}



	void remove(int from, int to) {

/*

		{

			int pos = Collections.binarySearch(g[from], new Edge(to, 0));

			Edge e = g[from].get(pos);

			remove(from, to, e);

			g[from].remove(pos);

		}

		{

			int pos = Collections.binarySearch(g[to], new Edge(from, 0));

			Edge e = g[to].get(pos);

			remove(to, from, e);

			g[to].remove(pos);

		}

		*/

		for (Edge e : g[from]) {



			if (e.to == to) {



				remove(from, to, e);

				remove(to, from, e.rev);



				g[from].remove(e);

				g[to].remove(e.rev);

				break;

			}

		}

	}



	void remove(int from, int to, Edge e) {



		if (e.cap == 0) {



			Arrays.fill(used, false);

			if (dfs(from, to, 1) == 0) {

				Arrays.fill(used, false);

				dfs(n - 1, 1, 1);

				if (e.cap == 0) {

					Arrays.fill(used, false);

					dfs_desc(from, to, 1);

					e.cap = 1;

					e.rev.cap = 1;

				}

				flow--;

			}

		}

		

		

	

	}



	void max_frow_c1(int s, int t) {



		Arrays.fill(used, false);

		if (s > t) {

			flow += dfs(s, t, INF);

		} else {

			flow += dfs_desc(s, t, INF);

		}

	}



	void max_frow(int s, int t) {



		for (int f = 1; f != 0; flow += f) {



			Arrays.fill(used, false);

			if (s > t) {

				f = dfs(s, t, INF);

			} else {

				f = dfs_desc(s, t, INF);

			}

		}

	}



	int dfs_desc(int v, int t, int f) {

		if (v == t)

			return f;

		used[v] = true;

		Edge e = null;

		for (int i = 0; i < g[v].size(); i++) {

			e = g[v].get(g[v].size() - i - 1);



			if (!used[e.to] && e.cap > 0) {



				int d = 0;

				if (e.to > t) {

					d = dfs(e.to, t, Math.min(f, e.cap));

				} else {

					d = dfs_desc(e.to, t, Math.min(f, e.cap));

				}



				// int d = dfs(e.to, t, Math.min(f, e.cap));

				if (d > 0) {



					e.cap -= d;

					e.rev.cap += d;

					return d;

				}

			}

		}

		return 0;

	}



	int dfs(int v, int t, int f) {

		if (v == t)

			return f;

		used[v] = true;

		Edge e = null;

		for (int i = 0; i < g[v].size(); i++) {

			e = g[v].get(i);



			if (!used[e.to] && e.cap > 0) {



				int d = 0;

				if (e.to > t) {

					d = dfs(e.to, t, Math.min(f, e.cap));

				} else {

					d = dfs_desc(e.to, t, Math.min(f, e.cap));

				}



				if (d > 0) {



					e.cap -= d;

					e.rev.cap += d;

					return d;

				}

			}

		}

		return 0;

	}



	void add(int from, int to) {

		Edge e = new Edge(to, 1), rev = new Edge(from, 1);



		e.rev = rev;

		rev.rev = e;



		int pos = Collections.binarySearch(g[from], e);

		g[from].add(~pos, e);



		pos = Collections.binarySearch(g[to], rev);

		g[to].add(~pos, rev);

		// g[to].addFirst(rev);

	}



	class Edge implements Comparable<Edge> {

		int to, cap;

		Edge rev;



		public Edge(int to, int cap) {



			this.to = to;

			this.cap = cap;

		}



		public int compareTo(Edge tar) {

			return this.to - tar.to;

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}



}