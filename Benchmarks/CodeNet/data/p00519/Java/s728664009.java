import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] C = new int[N];
		int[] R = new int[N];
		for (int i = 0; i < N; ++i) {
			C[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		ArrayList<ArrayList<Integer>> g = new ArrayList<ArrayList<Integer>>(N);
		for (int i = 0; i < N; ++i) {
			g.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < K; ++i) {
			int A = sc.nextInt() - 1;
			int B = sc.nextInt() - 1;
			g.get(A).add(B);
			g.get(B).add(A);
		}
		PriorityQueue<St> q = new PriorityQueue<St>();
		q.add(new St(0, 0));
		int[] min = new int[N];
		int[] used = new int[N];
		Arrays.fill(min, 1 << 30);
		Arrays.fill(used, -1);
		min[0] = 0;
		while (true) {
			St cs = q.poll();
			if (cs.p == N - 1) {
				System.out.println(cs.c);
				break;
			}
			if (cs.c > min[cs.p]) continue;
			ArrayList<Integer> cur = new ArrayList<Integer>();
			cur.add(cs.p);
			int nc = cs.c + C[cs.p];
			for (int i = 0; i < R[cs.p] && !cur.isEmpty(); ++i) {
				ArrayList<Integer> next = new ArrayList<Integer>();
				for (int cp : cur) {
					for (int np : g.get(cp)) {
						if (nc < min[np]) {
							min[np] = nc;
							q.add(new St(np, nc));
						}
						if (used[np] != cs.p) {
							used[np] = cs.p;
							next.add(np);
						}
					}
				}
				cur = next;
			}
		}
	}

	static class St implements Comparable<St> {
		int p, c;

		St(int p, int c) {
			this.p = p;
			this.c = c;
		}

		public int compareTo(St o) {
			return this.c - o.c;
		}
	}

}