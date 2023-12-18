import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int r = scanner.nextInt(), c = scanner.nextInt(), k = scanner.nextInt();
			long[][] v = new long[r][c];
			long[][][] buffer = new long[r][c][c];
			IntStream.range(0, r).forEach(i -> IntStream.range(0, c).forEach(j -> Arrays.fill(buffer[i][j], -1L)));
			IntStream.range(0, k).forEach(i -> v[scanner.nextInt() - 1][scanner.nextInt() - 1] = scanner.nextLong());
			System.out.println(getResult(0, 0, 0, r, c, v, 0L, buffer));
		}
	}

	private static long getResult(int x, int y, int lineStart, int r, int c, long[][] v, long currentValue,
			long[][][] buffer) {
		if ((x == r - 1) && (y == c - 1)) {
			long result = 0L;
			if (buffer[x][lineStart][y] >= 0) {
				result = buffer[x][lineStart][y];
			} else {
				result = buffer[x][lineStart][y] = IntStream.rangeClosed(lineStart, y).mapToLong(i -> v[x][i]).sorted()
						.skip(Math.max(0, y - lineStart - 2)).sum();
			}
			return currentValue + result;
		}
		if (r - 1 == x) {
			return getResult(x, y + 1, lineStart, r, c, v, currentValue, buffer);
		} else if (c - 1 == y) {
			long result = 0L;
			if (buffer[x][lineStart][y] >= 0) {
				result = buffer[x][lineStart][y];
			} else {
				result = buffer[x][lineStart][y] = IntStream.rangeClosed(lineStart, y).mapToLong(i -> v[x][i]).sorted()
						.skip(Math.max(0, y - lineStart - 2)).sum();
			}
			return getResult(x + 1, y, y, r, c, v, currentValue + result, buffer);
		} else {
			long result = 0L;
			if (buffer[x][lineStart][y] >= 0) {
				result = buffer[x][lineStart][y];
			} else {
				result = buffer[x][lineStart][y] = IntStream.rangeClosed(lineStart, y).mapToLong(i -> v[x][i]).sorted()
						.skip(Math.max(0, y - lineStart - 2)).sum();
			}
			return Math.max(getResult(x, y + 1, lineStart, r, c, v, currentValue, buffer),
					getResult(x + 1, y, y, r, c, v, currentValue + result, buffer));
		}
	}
}
