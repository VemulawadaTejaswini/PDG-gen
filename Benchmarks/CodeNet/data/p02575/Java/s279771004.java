import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	/** 最大値 */
	private static final int INF = Integer.MAX_VALUE >> 1;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int h = scanner.nextInt(), w = scanner.nextInt();
			int[] a = new int[h], b = new int[h];
			IntStream.range(0, h).forEach(i -> {
				a[i] = scanner.nextInt() - 1;
				b[i] = scanner.nextInt() - 1;
			});
			int[][] dp = new int[2][w];
			Arrays.fill(dp[0], 0);
			Arrays.fill(dp[1], INF);
			int[] result = calc(h, w, dp, a, b);
			IntStream.rangeClosed(1, h).forEach(i -> System.out.println((INF == result[i]) ? -1 : result[i]));
		}
	}

	/**
	 * 個々のマスまで移動するための最小移動回数を計算する
	 * 
	 * @param h  縦幅-1
	 * @param w  横幅
	 * @param dp 結果の配列
	 * @param a
	 * @param b
	 * @return 結果の配列
	 */
	private static int[] calc(int h, int w, int[][] dp, int[] a, int[] b) {
		int[] result = new int[h + 1];
		Arrays.fill(result, INF);
		Queue<Data> queue = new PriorityQueue<>();
		IntStream.range(0, w).filter(j -> (j < a[0]) || (j > b[0])).forEach(j -> queue.add(new Data(0, j, 0)));
		int currentLine = 0;
		while (!queue.isEmpty()) {
			Data data = queue.poll();
			int x = data.x, y = data.y;
			if (x > currentLine) {
				result[currentLine] = Arrays.stream(dp[currentLine & 1]).min().getAsInt();
				Arrays.fill(dp[currentLine & 1], INF);
				currentLine++;
			}
			if (dp[x & 1][y] == data.dp) {
				if ((x < h) && (a[x] <= y) && (y <= b[x])) {
					// 右のみに行く
					int nx = x, ny = y + 1;
					if ((nx <= h) && (ny < w) && (dp[nx & 1][ny] > dp[x & 1][y] + 1)) {
						dp[nx & 1][ny] = dp[x & 1][y] + 1;
						queue.add(new Data(nx, ny, dp[nx & 1][ny]));
					}
				} else {
					// 右に行く
					int nx = x, ny = y + 1;
					if ((nx <= h) && (ny < w) && (dp[nx & 1][ny] > dp[x & 1][y] + 1)) {
						dp[nx & 1][ny] = dp[x & 1][y] + 1;
						queue.add(new Data(nx, ny, dp[nx & 1][ny]));
					}
					// 下に行く
					nx = x + 1;
					ny = y;
					if ((nx <= h) && (ny < w) && (dp[nx & 1][ny] > dp[x & 1][y] + 1)) {
						dp[nx & 1][ny] = dp[x & 1][y] + 1;
						queue.add(new Data(nx, ny, dp[nx & 1][ny]));
					}
				}
			}
		}
		result[currentLine] = Arrays.stream(dp[currentLine & 1]).min().getAsInt();
		return result;
	}

	/**
	 * x,y,dpを表すクラス
	 */
	private static class Data implements Comparable<Data> {
		int x;
		int y;
		int dp;

		Data(int x, int y, int dp) {
			super();
			this.x = x;
			this.y = y;
			this.dp = dp;
		}

		@Override
		public int compareTo(Data data) {
			if (x == data.x) {
				return Integer.compare(dp, data.dp);
			} else {
				return Integer.compare(x, data.x);
			}
		}
	}
}
