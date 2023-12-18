import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int H, W, startR, startC, goalR, goalC;
	static int[][] f;

	public static void main(String[] args) {
		while (true) {
			H = sc.nextInt();
			W = sc.nextInt();
			if (H == 0) break;
			f = new int[H][W];
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					f[i][j] = sc.nextInt();
				}
			}
			startR = sc.nextInt();
			startC = sc.nextInt();
			goalR = sc.nextInt();
			goalC = sc.nextInt();
			System.out.println(solve());
		}
	}

	static int solve() {
		HashSet<State> visited = new HashSet<State>();
		State start = new State(startR, startC, new Dice(new int[] { 1, 5, 3, 2, 4, 6 }), 0);
		PriorityQueue<State> q = new PriorityQueue<State>();
		q.add(start);
		while (true) {
			State st = q.poll();
			if (st.r == goalR && st.c == goalC) return st.pena;
			if (visited.contains(st)) continue;
			visited.add(st);
			if (st.r > 0) {
				st.dice.rollN();
				q.add(new State(st.r - 1, st.c, st.dice, st.pena + st.dice.bottom() * f[st.r - 1][st.c]));
				st.dice.rollS();
			}
			if (st.r < H - 1) {
				st.dice.rollS();
				q.add(new State(st.r + 1, st.c, st.dice, st.pena + st.dice.bottom() * f[st.r + 1][st.c]));
				st.dice.rollN();
			}
			if (st.c < W - 1) {
				st.dice.rollE();
				q.add(new State(st.r, st.c + 1, st.dice, st.pena + st.dice.bottom() * f[st.r][st.c + 1]));
				st.dice.rollW();
			}
			if (st.c > 0) {
				st.dice.rollW();
				q.add(new State(st.r, st.c - 1, st.dice, st.pena + st.dice.bottom() * f[st.r][st.c - 1]));
				st.dice.rollE();
			}
		}
	}

	static class State implements Comparable<State> {
		int pena;
		int r, c;
		Dice dice;

		State(int r, int c, Dice dice, int pena) {
			this.r = r;
			this.c = c;
			this.dice = dice.clone();
			this.pena = pena;
		}

		public boolean equals(Object o) {
			State state = (State) o;
			return this.r == state.r && this.c == state.c && this.dice.equals(state.dice);
		}

		public int hashCode() {
			int ret = 31;
			ret = ret * 17 + r;
			ret = ret * 17 + c;
			ret = ret * 17 + dice.hashCode();
			return ret;
		}

		public int compareTo(State o) {
			return this.pena - o.pena;
		}

	}

	static class Dice {
		int[] val = new int[6];

		Dice(int[] val) {
			if (val[0] + val[5] != 7 || val[1] + val[3] != 7 || val[2] + val[4] != 7) throw new RuntimeException();
			for (int i = 0; i < 6; ++i) {
				this.val[i] = val[i];
			}
		}

		void rollN() {
			int tmp = north();
			this.val[1] = this.val[0];
			this.val[0] = this.val[3];
			this.val[3] = this.val[5];
			this.val[5] = tmp;
		}

		void rollS() {
			int tmp = south();
			this.val[3] = this.val[0];
			this.val[0] = this.val[1];
			this.val[1] = this.val[5];
			this.val[5] = tmp;
		}

		void rollE() {
			int tmp = east();
			this.val[2] = this.val[0];
			this.val[0] = this.val[4];
			this.val[4] = this.val[5];
			this.val[5] = tmp;
		}

		void rollW() {
			int tmp = west();
			this.val[4] = this.val[0];
			this.val[0] = this.val[2];
			this.val[2] = this.val[5];
			this.val[5] = tmp;
		}

		public boolean equals(Object o) {
			if (!(o instanceof Dice)) return false;
			return Arrays.equals(this.val, ((Dice) o).val);
		}

		public int hashCode() {
			return Arrays.hashCode(this.val);
		}

		public Dice clone() {
			return new Dice(this.val);
		}

		int top() {
			return this.val[0];
		}

		int bottom() {
			return this.val[5];
		}

		int north() {
			return this.val[1];
		}

		int south() {
			return this.val[3];
		}

		int east() {
			return this.val[2];
		}

		int west() {
			return this.val[4];
		}

	}

}