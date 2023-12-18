
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static int N = 3;
	static int N2 = 9;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		Puzzle puzzle = new Puzzle();
		for (int i = 0; i < N2; i++) {
			int v = scanner.nextInt();
			puzzle.map[i] = v;
			if (v == 0) {
				puzzle.space = i;
			}
		}
		System.out.println(slove(puzzle));
	}

	int[][] dxy = { { -1, 0 }, { 0, -1 }, { 0, 1 }, { 1, 0 } };

	private int slove(Puzzle in) {
		Puzzle u = new Puzzle();
		Puzzle v = new Puzzle();
		Deque<Puzzle> deque = new ArrayDeque<Puzzle>();
		Set<Puzzle> set = new HashSet<Main.Puzzle>();
		set.add(in);
		deque.offer(in);
		while (!deque.isEmpty()) {
			u = deque.poll();
			if (isTrue(u)) {
				return u.count;
			}
			int y = u.space / N;
			int x = u.space % N;
			for (int[] a : dxy) {
				int dy = y + a[0];
				int dx = x + a[1];
				if (dy < 0 || dx < 0 || N <= dy || N <= dx)
					continue;
				v = u.clone();
				swap(v, u.space, dy * N + dx);
				v.space = dy * N + dx;
				if (!set.contains(v)) {
					set.add(v);
					v.count++;
					deque.offer(v);
				}
			}
		}
		return -1;
	}

	private boolean isTrue(Puzzle u) {
		for (int i = 0; i < N2 - 1; i++) {
			if (u.map[i] != i + 1) {
				return false;
			}
		}
		return true;
	}

	private void swap(Puzzle v, int space, int i) {
		int t = v.map[i];
		v.map[i] = v.map[space];
		v.map[space] = t;

	}
	class Puzzle implements Cloneable {
		int[] map = new int[N2];
		int space;
		int count = 0;

		@Override
		public Puzzle clone() {
			try {
				Puzzle clonePuzzle = (Puzzle) super.clone();
				clonePuzzle.map = Arrays.copyOf(map, N2);
				return clonePuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + Arrays.hashCode(map);
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
			if (!Arrays.equals(map, other.map))
				return false;
			return true;
		}

		private Main getOuterType() {
			return Main.this;
		}

	}
}