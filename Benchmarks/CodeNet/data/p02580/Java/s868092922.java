
/**
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

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
		int targets = scanner.nextInt();

		int[] rowCount = new int[rows];
		int[] colCount = new int[cols];

		Map<Integer, Set<Integer>> targetP = new HashMap<>();

		for (int i = 0; i < targets; i++) {
			int nextRow = scanner.nextInt() - 1;
			int nextCol = scanner.nextInt() - 1;

			targetP.putIfAbsent(nextRow, new HashSet<>());
			targetP.get(nextRow).add(nextCol);

			rowCount[nextRow]++;
			colCount[nextCol]++;
		}

		Set<Integer> rowCandidates = new HashSet<>();
		int maxRowVal = 0;
		Set<Integer> colCandidates = new HashSet<>();
		int maxColVal = 0;

		for (int i = 0; i < rows; i++) {
			if (rowCount[i] > maxRowVal) {
				maxRowVal = rowCount[i];
				rowCandidates.clear();
				rowCandidates.add(i);
			} else if (rowCount[i] == maxRowVal) {
				rowCandidates.add(i);
			}
		}

		for (int i = 0; i < cols; i++) {
			if (colCount[i] > maxColVal) {
				maxColVal = colCount[i];
				colCandidates.clear();
				colCandidates.add(i);
			} else if (colCount[i] == maxColVal) {
				colCandidates.add(i);
			}
		}

		int res = maxRowVal + maxColVal;

		for (int r : rowCandidates) {
			for (int c : colCandidates) {
				if (!targetP.get(r).contains(c)) {
					writer.println(res);
					return;
				}
			}
		}

		writer.println(res - 1);
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
