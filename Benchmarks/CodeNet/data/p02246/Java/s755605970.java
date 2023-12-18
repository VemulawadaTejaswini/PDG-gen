
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		MDT = new int[16][16];
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				MDT[i][j] = Math.abs(i / 4 - j / 4) + Math.abs(i % 4 - j % 4);
			}
		}
		int[] a = new int[16];
		int zero = -1;
		for (int i = 0; i < 16; i++) {
			a[i] = scanner.nextInt();
			if (a[i] == 0)
				zero = i;
		}
		int md = getMD(a);
		Puzzle in = new Puzzle(a, zero, md);

		for (limit = in.md; limit <= 45; limit++) {
			puzzle = in.clone();
			if (dfs(0, -100)) {
				System.out.println(limit);
				break;
			}
		}

	}

	Puzzle puzzle;

	private boolean dfs(int depth, int s) {
		if (puzzle.md == 0)
			return true;
		if (puzzle.md + depth > limit)
			return false;

		int y = puzzle.zero / 4;
		int x = puzzle.zero % 4;
		for (int r = 0; r < 4; r++) {

			int ny = y + move[r][0];
			int nx = x + move[r][1];
			if (ny < 0 || 4 <= ny || nx < 0 || 4 <= nx)
				continue;
			if (Math.max(s, r) - Math.min(s, r) == 2)
				continue;
			int nz = ny * 4 + nx;
			Puzzle p = puzzle.clone();
			
			puzzle.md -= MDT[nz][puzzle.map[nz] - 1];
			puzzle.md += MDT[puzzle.zero][p.map[nz] - 1];
			swap(puzzle.map, puzzle.zero, nz);
			puzzle.zero = nz;
			if (dfs(depth + 1, r))
				return true;
			puzzle = p;

		}
		return false;

	}

	int limit;

	private void swap(int[] tmpMap, int zero, int nz) {
		int tmp = tmpMap[zero];
		tmpMap[zero] = tmpMap[nz];
		tmpMap[nz] = tmp;
	}

	int[][] move = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

	private int getMD(int[] a) {
		int sum = 0;
		for (int i = 0; i < 16; i++) {
			if (a[i] == 0)
				continue;
			sum += MDT[i][a[i] - 1];
		}
		return sum;
	}

	int[][] MDT;

	class Puzzle implements Cloneable {
		int[] map;
		int zero;
		int md;

		public Puzzle(int[] map, int zero, int md) {
			super();
			this.map = map;
			this.zero = zero;
			this.md = md;
		}

		@Override
		public Puzzle clone() {
			try {
				Puzzle clonePuzzle = (Puzzle) super.clone();
				clonePuzzle.map = Arrays.copyOf(this.map, 16);
				return clonePuzzle;
			} catch (CloneNotSupportedException e) {
				throw new InternalError();
			}
		}

		@Override
		public String toString() {
			return "Puzzle [map=" + Arrays.toString(map) + ", zero=" + zero
					+ ", md=" + md + "]";
		}

	}
}