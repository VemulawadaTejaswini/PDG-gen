import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static HashMap<String, Integer> names;
	static int[][] dist;

	public static void main(String[] args) throws Exception {
		while (true) {
			N = sc.nextInt();
			M = sc.nextInt();
			dist = new int[N][N];
			if (N == 0) return;
			names = new HashMap<String, Integer>();
			String s = sc.next();
			String p = sc.next();
			String g = sc.next();
			for (int i = 0; i < M; ++i) {
				int ai = getSi(sc.next());
				int bi = getSi(sc.next());
				int d = sc.nextInt();
				int t = sc.nextInt();
				int time = d / 40 + t;
				dist[ai][bi] = dist[bi][ai] = time;
			}
			int si = getSi(s);
			int pi = getSi(p);
			int gi = getSi(g);
			int t1 = shortestPath(si, pi);
			int t2 = shortestPath(pi, gi);
			System.out.println(t1 + t2);
		}
	}

	static int shortestPath(int from, int to) {
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(new State(from, 0));
		boolean[] visited = new boolean[N];
		while (!q.isEmpty()) {
			State cur = q.poll();
			if (visited[cur.pos]) continue;
			if (cur.pos == to) {
				return cur.time;
			}
			visited[cur.pos] = true;
			for (int i = 0; i < N; ++i) {
				if (dist[cur.pos][i] == 0) continue;
				if (visited[i]) continue;
				q.add(new State(i, cur.time + dist[cur.pos][i]));
			}
		}
		return Integer.MIN_VALUE;
	}

	static class State implements Comparable<State> {
		int pos;
		int time;

		State(int pos, int time) {
			this.pos = pos;
			this.time = time;
		}

		public int compareTo(State o) {
			return this.time - o.time;
		}
	}

	static int getSi(String name) {
		if (!names.containsKey(name)) {
			names.put(name, names.size());
		}
		return names.get(name);
	}

}