import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N, M;
	static ArrayList<ArrayList<Integer>> bar = new ArrayList<ArrayList<Integer>>();
	static HashSet<State> used = new HashSet<State>();

	public static void main(String[] args) {
		N = sc.nextInt();
		M = sc.nextInt();
		for (int i = 0; i < N - 1; ++i) {
			bar.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < M; ++i) {
			int a = sc.nextInt() - 1;
			bar.get(a).add(i);
		}
		HashSet<State> cur = new HashSet<State>();
		cur.add(new State());
		for (int i = 0; i < N; ++i) {
			HashSet<State> next = new HashSet<State>();
			for (State s : cur) {
				if (s.goal()) {
					System.out.println(i);
					return;
				}
				s.trans(next, 0, 0);
			}
			cur = next;
		}
	}

	static class State {
		int[] count;

		State() {
			count = new int[N - 1];
		}

		State(State o) {
			count = o.count.clone();
		}

		public int hashCode() {
			return Arrays.hashCode(count);
		}

		public boolean equals(Object o) {
			if (this == o) return true;
			if (getClass() != o.getClass()) return false;
			return Arrays.equals(count, ((State) o).count);
		}

		void trans(HashSet<State> next, int use, int pos) {
			if (pos == N - 1) {
				State n = new State(this);
				for (int i = 0; i < N - 1; ++i) {
					if ((use & (1 << i)) != 0) n.count[i]++;
				}
				if (!used.contains(n)) {
					used.add(n);
					next.add(n);
				}
				return;
			}
			trans(next, use, pos + 1);
			if (canUse(use, pos)) {
				trans(next, use | (1 << pos), pos + 1);
			}
		}

		boolean canUse(int use, int pos) {
			if (count[pos] == bar.get(pos).size()) return false;
			if (pos > 0 && (use & (1 << (pos - 1))) != 0) return false;
			if (pos > 0) {
				if (count[pos - 1] < bar.get(pos - 1).size()
						&& bar.get(pos - 1).get(count[pos - 1]) < bar.get(pos).get(count[pos])) return false;
			}
			if (pos < N - 2) {
				if (count[pos + 1] < bar.get(pos + 1).size()
						&& bar.get(pos + 1).get(count[pos + 1]) < bar.get(pos).get(count[pos])) return false;
			}
			return true;
		}

		boolean goal() {
			for (int i = 0; i < N - 1; ++i) {
				if (count[i] != bar.get(i).size()) return false;
			}
			return true;
		}
	}

}