import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<ArrayList<Integer>> g;

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			g = new ArrayList<ArrayList<Integer>>();
			for (int i = 0; i < 100; ++i) {
				g.add(new ArrayList<Integer>());
			}
			for (int i = 0; i < N; ++i) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				g.get(a).add(b);
				g.get(b).add(a);
			}

			HashSet<State> set = new HashSet<State>();
			ArrayList<State> cur = new ArrayList<State>();
			for (int i = 0; i < N; ++i) {
				State st = new State().move(i);
				set.add(st);
				cur.add(st);
			}
			for (int i = 0;; ++i) {
				if (cur.isEmpty()) {
					System.out.println(i);
					break;
				}
				ArrayList<State> next = new ArrayList<State>();
				for (State st : cur) {
					for (int n : g.get(st.pos())) {
						if (!st.used(n)) {
							State ns = st.move(n);
							if (!set.contains(ns)) {
								set.add(ns);
								next.add(ns);
							}
						}
					}
				}
				cur = next;
			}
		}
	}

	static class State {

		long v1, v2;

		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (v1 ^ (v1 >>> 32));
			result = prime * result + (int) (v2 ^ (v2 >>> 32));
			return result;
		}

		public boolean equals(Object obj) {
			if (this == obj) return true;
			State other = (State) obj;
			return this.v1 == other.v1 && this.v2 == other.v2;
		}

		boolean used(int v) {
			if (v < 64) {
				return (v1 & (1L << v)) != 0;
			} else {
				return (v2 & (1L << (v - 64))) != 0;
			}
		}

		State move(int v) {
			State ret = new State();
			ret.v1 = this.v1;
			ret.v2 = this.v2 & ((1L << 40) - 1);
			ret.v2 |= ((long) v) << 40;
			if (v < 64) {
				ret.v1 |= (1L << v);
			} else {
				ret.v2 |= (1L << (v - 64));
			}
			return ret;
		}

		int pos() {
			return (int) (v2 >> 40);
		}

	}

}