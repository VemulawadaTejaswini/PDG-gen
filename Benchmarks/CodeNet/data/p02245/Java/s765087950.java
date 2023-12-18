
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int N = 3;
	static int N2 = 9;

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Puzzle in = new Puzzle();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < N2; i++) {
			in.f[i] = scanner.nextInt();
			if (in.f[i] == 0) {
				in.f[i] = N2;
				in.space = i;
			}
		}
		String ans = bfs(in);
		System.out.println(ans.length());
	}

	int[] dx = { -1, 0, 1, 0 };
	int[] dy = { 0, -1, 0, 1 };
	char[] dir = { 'u', 'l', 'd', 'r' };

	private String bfs(Puzzle s) {
		Deque<Puzzle> Q = new ArrayDeque<Main.Puzzle>();
		Map<Puzzle, Boolean> V = new HashMap<Main.Puzzle, Boolean>();
		Puzzle u = new Puzzle();
		Puzzle v = new Puzzle();
		s.path = "";
		Q.push(s);
		V.put(s, true);
		while (!Q.isEmpty()) {
			u = Q.poll();
			if (isTarget(u))
				return u.path;
			int sx = u.space / N;
			int sy = u.space % N;
			for (int r = 0; r < 4; r++) {
				int tx = sx + dx[r];
				int ty = sy + dy[r];
				if (tx < 0 || ty < 0 || tx >= N || ty >= N)
					continue;
				v = (Puzzle) u.clone();
				swap(v, u.space, tx * N + ty);
				v.space = tx * N + ty;
				if (!V.containsKey(v) || !V.get(v)) {
					V.put(v, true);
					v.path += dir[r];
					Q.offer(v);
				}
			}
		}

		return "unslovable";
	}

	private void swap(Puzzle v, int space, int i) {
		int tmp = v.f[space];
		v.f[space] = v.f[i];
		v.f[i] = tmp;
	}

	private boolean isTarget(Puzzle p) {
		for (int i = 0; i < N2; i++) {
			if (p.f[i] != (i + 1))
				return false;
		}
		return true;
	}
	class Puzzle implements Cloneable {
		int[] f = new int[N2];
		int space;
		String path;
		
		public Puzzle clone() {
			try {
				Puzzle clonePuzzle = (Puzzle) super.clone();
				int[] clonef = Arrays.copyOf(f, f.length);
				clonePuzzle.f = clonef;
				return clonePuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError(e.toString());
			}
		}

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

		private Main getOuterType() {
			return Main.this;
		}
		

	}
}