
import java.util.Arrays;
import java.util.Scanner;

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
			in.map[i] = scanner.nextInt();
			if (in.map[i] == 0) {
				in.space = i;
			}
		}
		iterative_deepening(in);
		System.out.println(limit);
	}

	private void iterative_deepening(Puzzle in) {
		in.MD = getAllMD(in);
		for (limit = in.MD; limit <= 45; limit++) {
			state = in.clone();
			if (dfs(0, -3)) {
				return;
			}
		}
	}

	private boolean dfs(int depth, int prev) {
		if (state.MD == 0)
			return true;
		if (depth + state.MD > limit)
			return false;

		int y = state.space / N;
		int x = state.space % N;
		for (int i = 0; i < 4; i++) {
			int dy = y + dxy[i][0];
			int dx = x + dxy[i][1];
			if (dy < 0 || dx < 0 || N <= dy || N <= dx)
				continue;
			if (Math.max(i, prev) - Math.min(i, prev) == 2)
				continue;
			int newSpace = dy * N + dx;
			Puzzle tmpPuzzle = state.clone();
			state.MD -= MDT[newSpace][state.map[newSpace] - 1];
			state.MD += MDT[state.space][state.map[newSpace] - 1];
			swap(newSpace, state.space);
			state.space = newSpace;
			if (dfs(depth + 1, i)) {
				return true;
			}
			state = tmpPuzzle;

		}
		return false;
	}

	private void swap(int newSpace, int space) {
		int tmp = state.map[newSpace];
		state.map[newSpace] = state.map[space];
		state.map[space] = tmp;
	}

	private int getAllMD(Puzzle in) {
		int sum = 0;
		for (int i = 0; i < N2; i++) {
			if (in.map[i] == 0)
				continue;
			sum += MDT[i][in.map[i] - 1];
		}
		return sum;
	}

	int N = 4;
	int N2 = 16;
	int[][] MDT = new int[N2][N2];
	int limit;
	Puzzle state;
	int[][] dxy = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

	class Puzzle implements Cloneable {
		int[] map = new int[N2];
		int space;
		int MD;

		@Override
		public Puzzle clone() {
			Puzzle clonePuzzle;
			try {
				clonePuzzle = (Puzzle) super.clone();
				clonePuzzle.map = Arrays.copyOf(map, N2);
				return clonePuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}

		}

	}
}