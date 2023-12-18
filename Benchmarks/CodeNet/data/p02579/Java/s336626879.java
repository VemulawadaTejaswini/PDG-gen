
/**
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * @author b
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		PrintWriter writer = new PrintWriter(System.out);
		solve(scanner, writer);
		writer.close();
	}

	private static void solve(Scanner scanner, PrintWriter writer) {

		int rows = scanner.nextInt(), cols = scanner.nextInt();
		int startRow = scanner.nextInt() - 1, startCol = scanner.nextInt() - 1;
		int endRow = scanner.nextInt() - 1, endCol = scanner.nextInt() - 1;

		boolean[][] grid = new boolean[rows][cols];
		for (int i = 0; i < rows; i++) {
			char[] line = scanner.next().toCharArray();
			for (int j = 0; j < cols; j++) {
				grid[i][j] = line[j] == '.';
			}
		}

		// -1 havent been there
		// 0 can reach without magic
		// x requires x amount of magic
		int[][] magicCounts = new int[rows][cols];
		for (int i = 0; i < rows; i++)
			Arrays.fill(magicCounts[i], -1);

		magicCounts[startRow][startCol] = 0;
		Queue<Pair> toCheck = new PriorityBlockingQueue<>();
		toCheck.add(new Pair(startRow, startCol, 0));

		while (!toCheck.isEmpty()) {
			Pair next = toCheck.poll();
			int magicUsed = magicCounts[next.row][next.col];

			if (next.row == endRow && next.col == endCol) {
				break;
			}

			for (int i = -2; i <= 2; i++) {
				for (int j = -2; j <= 2; j++) {
					int r = next.row + i;
					int c = next.col + j;
					if (r < 0 || r >= rows)
						continue;
					if (c < 0 || c >= cols)
						continue;
					if (i == 0 && j == 0)
						continue;
					if (!grid[r][c])
						continue;

					int addMagic = 0;
					if (Math.abs(i) + Math.abs(j) != 1) {
						addMagic = 1;
					}

					if (magicCounts[r][c] == -1 || magicCounts[r][c] > magicUsed + addMagic) {
						magicCounts[r][c] = magicUsed + addMagic;
						toCheck.add(new Pair(r, c, magicCounts[r][c]));
					}
				}
			}
		}

		writer.println(magicCounts[endRow][endCol]);
	}

	static class Pair implements Comparable<Pair> {
		int row;
		int col;

		int priority;

		public Pair(int row, int col, int priority) {
			this.row = row;
			this.col = col;
			this.priority = priority;
		}

		@Override
		public int compareTo(Pair o) {

			return this.priority - o.priority;
		}
	}

	// Props to SecondThread
	static class Scanner {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer("");

		String next() {
			while (!tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return tokenizer.nextToken();
		}

		long[] nextLongArr(int num) {
			long[] vals = new long[num];
			for (int i = 0; i < num; i++)
				vals[i] = nextLong();
			return vals;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		int[] nextIntArr(int numberOfElements) {
			int[] values = new int[numberOfElements];
			for (int i = 0; i < numberOfElements; i++)
				values[i] = nextInt();
			return values;
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
