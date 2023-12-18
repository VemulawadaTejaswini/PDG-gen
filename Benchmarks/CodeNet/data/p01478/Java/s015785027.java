import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;
	static int[][] cost;

	static int solve() {
		PriorityQueue<State> q = new PriorityQueue<State>();
		int[] ord = new int[N];
		for (int i = 0; i < N; ++i) {
			ord[i] = i;
		}
		q.add(new State(0, ord));
		HashSet<State> visited = new HashSet<State>();
		int ans = 0;
		while (!q.isEmpty()) {
			State cur = q.poll();
			if (visited.contains(cur)) continue;
			ans = cur.v;
			visited.add(cur);
			for (int i = 0; i < N; ++i) {
				for (int j = i + 1; j < N; ++j) {
					swap(cur.ord, i, j);
					State next = new State(cur.v + cost[i][j], cur.ord);
					if (!visited.contains(next)) {
						q.add(next);
					}
					swap(cur.ord, i, j);
				}
			}
		}
		return ans;
	}

	static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void main(String[] args) {
		N = sc.nextInt();
		cost = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				cost[i][j] = sc.nextInt();
			}
		}
		System.out.println(solve());
	}

	static class State implements Comparable<State> {
		int v;
		int[] ord;

		State(int v, int[] o) {
			this.v = v;
			this.ord = o.clone();
		}

		public int compareTo(State o) {
			return this.v - o.v;
		}

		public int hashCode() {
			return Arrays.hashCode(ord);
		}

		public boolean equals(Object obj) {
			if (this == obj) return true;
			State other = (State) obj;
			return Arrays.equals(ord, other.ord);
		}

	}

}