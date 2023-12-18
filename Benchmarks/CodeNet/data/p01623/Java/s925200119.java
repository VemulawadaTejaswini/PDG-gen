import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] g;
	static boolean[] dead;
	static int N;

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			g = new int[N][N];
			dead = new boolean[N];
			int M = sc.nextInt();
			Sink[] sk = new Sink[N];
			for (int i = 0; i < N; ++i) {
				sk[i] = new Sink(sc.nextInt(), i);
			}
			Arrays.sort(sk);
			for (int i = 0; i < M; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				int c = sc.nextInt();
				g[a][b] = g[b][a] = c;
			}
			if (!connect(N)) {
				System.out.println(0);
				continue;
			}
			int pos = 0;
			while (pos < N) {
				int pp = pos;
				int t = sk[pos].t;
				while (pos < N && sk[pos].t == t) {
					dead[sk[pos].i] = true;
					++pos;
				}
				if (!connect(N - pos)) {
					for (int i = pp; i < pos; ++i) {
						dead[sk[i].i] = false;
					}
					pos = pp;
					break;
				}
			}
			ArrayList<Integer> from = new ArrayList<Integer>();
			ArrayList<Integer> to = new ArrayList<Integer>();
			for (int i = 0; i < N; ++i) {
				if (!dead[i]) to.add(i);
			}
			from.add(to.get(to.size() - 1));
			to.remove(to.size() - 1);
			int ans = mst(from, to);
			from.addAll(to);
			while (pos > 0) {
				to.clear();
				int t = sk[pos - 1].t;
				while (pos > 0 && sk[pos - 1].t == t) {
					dead[sk[pos - 1].i] = false;
					to.add(sk[pos - 1].i);
					--pos;
				}
				ans += mst(from, to);
				from.addAll(to);
			}
			System.out.println(ans);
		}
	}

	static boolean connect(int rest) {
		int st = 0;
		for (int i = 0; i < N; ++i) {
			if (!dead[i]) {
				st = i;
				break;
			}
		}
		boolean[] used = new boolean[N];
		ArrayList<Integer> pos = new ArrayList<Integer>();
		pos.add(st);
		int c = 0;
		while (c != pos.size()) {
			int cur = pos.get(c);
			++c;
			used[cur] = true;
			for (int i = 0; i < N; ++i) {
				if (dead[i] || used[i]) continue;
				if (g[cur][i] == 0) continue;
				pos.add(i);
				used[i] = true;
			}
		}
		return c == rest;
	}

	static int mst(ArrayList<Integer> from, ArrayList<Integer> to) {
		boolean[] used = new boolean[N];
		PriorityQueue<Long> q = new PriorityQueue<Long>();
		for (int v : from) {
			q.add((long) v);
		}
		int sum = 0;
		while (!q.isEmpty()) {
			long cur = q.poll();
			int ci = (int) cur;
			int cc = (int) (cur >> 32);
			if (used[ci]) continue;
			sum += cc;
			used[ci] = true;
			for (int v : to) {
				if (used[v]) continue;
				if (g[ci][v] == 0) continue;
				q.add((((long) g[ci][v]) << 32) + v);
			}
		}
		return sum;
	}

	static class Sink implements Comparable<Sink> {
		int t, i;

		public Sink(int t, int i) {
			this.t = t;
			this.i = i;
		}

		public int compareTo(Sink o) {
			return this.t - o.t;
		}
	}

}