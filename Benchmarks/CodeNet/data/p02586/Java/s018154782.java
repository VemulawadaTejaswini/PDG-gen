import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr)) {
			String[] strings = br.readLine().split(" ");
			int r = Integer.parseInt(strings[0]), c = Integer.parseInt(strings[1]), k = Integer.parseInt(strings[2]);
			long[][] v = new long[r][c];
			IntStream.range(0, r).forEach(i -> Arrays.fill(v[i], 0L));
			long[][][] buffer = new long[r][c][c];
			IntStream.range(0, r).forEach(i -> IntStream.range(0, c).forEach(j -> Arrays.fill(buffer[i][j], -1L)));
			IntStream.range(0, k).forEach(i -> {
				try {
					String[] s = br.readLine().split(" ");
					v[Integer.parseInt(s[0]) - 1][Integer.parseInt(s[1]) - 1] = Long.parseLong(s[2]);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			long[][][] dp = new long[4][r][c];
			dp[0][0][0] = 0L;
			dp[1][0][0] = v[0][0];
			IntStream.range(0, r).forEach(i -> IntStream.range(0, c).forEach(j -> {
				if (i > 0) {
					dp[0][i][j] = max(dp[0][i][j],
							IntStream.range(0, 4).mapToLong(l -> dp[l][i - 1][j]).max().getAsLong());
					if (v[i][j] > 0) {
						dp[1][i][j] = max(dp[1][i][j],
								IntStream.range(0, 4).mapToLong(l -> dp[l][i - 1][j]).max().getAsLong() + v[i][j]);
					}
				}
				if (j > 0) {
					if (v[i][j] > 0) {
						IntStream.range(1, 4).forEach(
								l -> dp[l][i][j] = max(dp[l][i][j], dp[l - 1][i][j - 1] + v[i][j], dp[l][i][j - 1]));
					} else {
						IntStream.range(0, 4).forEach(l -> dp[l][i][j] = max(dp[l][i][j], dp[l][i][j - 1]));
					}
				}
			}));
			// print(dp, r, c);
			System.out.println(IntStream.range(0, 4).mapToLong(l -> dp[l][r - 1][c - 1]).max().getAsLong());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void print(long[][][] dp, int r, int c) {
		IntStream.range(0, r).forEach(i -> {
			IntStream.range(0, c).forEach(j -> {
				System.out.print("{");
				IntStream.range(0, 4).forEach(l -> System.out.print(dp[l][i][j] + ","));
				System.out.print("}  ");
			});
			System.out.println();
		});
	}

	/**
	 * 複数のlongのmaxを取得する
	 * 
	 * @param a 一つ目のlong
	 * @param b 二つ目以降のlong
	 * @return 複数のlongのmax
	 */
	private static long max(long a, long... b) {
		long result = a;
		for (long l : b) {
			result = Math.max(result, l);
		}
		return result;
	}
}
