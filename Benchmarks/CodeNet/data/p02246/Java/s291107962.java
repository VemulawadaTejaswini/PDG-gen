
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < N2; i++) {
			for (int j = 0; j < N2; j++) {
				MDT[i][j] = Math.abs(i / N - j / N) + Math.abs(i % N - j % N);
			}
		}
		Puzzle in = new Puzzle();
		for (int i = 0; i < N2; i++) {
			in.f[i] = scanner.nextInt();
			if (in.f[i] == 0) {
				in.f[i] = N2;
				in.space = i;
			}
		}
		System.out.println(astar(in));

	}

	private int astar(Puzzle s) {
		PriorityQueue<State> pq = new PriorityQueue<State>();
		s.MD = getAllMD(s);
		s.cost = 0;
		Set<Puzzle> V = new HashSet<Main.Puzzle>();
		Puzzle u = new Puzzle();
		Puzzle v = new Puzzle();
		State initial = new State();
		initial.puzzle = s;
		initial.estimated = getAllMD(s);
		pq.add(initial);
		V.add(s);
		while (!pq.isEmpty()) {
			State st = pq.poll();
			u = st.puzzle;
			if (u.MD == 0)
				return u.cost;
			int sx = u.space / N;
			int sy = u.space % N;
			for (int r = 0; r < 4; r++) {
				int tx = sx + dx[r];
				int ty = sy + dy[r];
				if (tx < 0 || ty < 0 || tx >= N || ty >= N)
					continue;
				v = u.clone();
				int newSpace = tx * N + ty;
				v.MD -= MDT[newSpace][v.f[newSpace] - 1];
				v.MD += MDT[v.space][v.f[newSpace] - 1];
				swap(v.f, v.space, newSpace);
				v.space = newSpace;
				if (!V.contains(v)) {
					V.add(v);
					v.cost++;
					State news = new State();
					news.puzzle = v;
					news.estimated = v.cost + v.MD;
					pq.add(news);
				}
			}
		}
		return -1;
	}

	private void swap(int[] f, int space, int newSpace) {
		int tmp = f[space];
		f[space] = f[newSpace];
		f[newSpace] = tmp;
	}

	private int getAllMD(Puzzle s) {
		int sum = 0;
		for (int i = 0; i < N2; i++) {
			if (s.f[i] == N2)
				continue;
			sum += MDT[i][s.f[i] - 1];
		}
		return sum;
	}

	int N = 4;
	int N2 = 16;
	int[][] MDT = new int[N2][N2];
	int[] dx = { 0, -1, 0, 1 };
	int[] dy = { 1, 0, -1, 0 };
	char[] dir = { 'r', 'u', 'l', 'd' };
	int count = 0;

	class Puzzle implements Cloneable {
		int[] f = new int[N2];
		int space;
		int MD;
		int cost;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(f);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Puzzle other = (Puzzle) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (!Arrays.equals(f, other.f))
				return false;
			return true;
		}

		@Override
		public Puzzle clone() {
			try {
				Puzzle clonePuzzle = (Puzzle) super.clone();
				clonePuzzle.f = Arrays.copyOf(f, N2);
				return clonePuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}

		private Main getOuterType() {
			return Main.this;
		}

	}

	class State implements Comparable<State> {
		Puzzle puzzle;
		int estimated;

		@Override
		public int compareTo(State o) {
			if (this.estimated == o.estimated)
				return this.puzzle.MD - o.puzzle.MD;
			return this.estimated - o.estimated;
		}
	}
}