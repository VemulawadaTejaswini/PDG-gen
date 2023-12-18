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
			int[][] dp = new int[h + 1][w];
			Arrays.fill(dp[0], 0);
			IntStream.rangeClosed(1, h).forEach(i -> Arrays.fill(dp[i], INF));
			calc(h, w, dp, a, b);
			IntStream.rangeClosed(1, h).forEach(i -> {
				int min = Arrays.stream(dp[i]).min().getAsInt();
				System.out.println((INF == min) ? -1 : min);
			});
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
	 */
	private static void calc(int h, int w, int[][] dp, int[] a, int[] b) {
		Queue<Data> queue = new PriorityQueue<>();
		IntStream.range(0, w).filter(j -> (j < a[0]) || (j > b[0])).forEach(j -> queue.add(new Data(0, j, 0)));
		while (!queue.isEmpty()) {
			Data data = queue.poll();
			int x = data.x, y = data.y;
			if (dp[x][y] == data.dp) {
				if ((x < h) && (a[x] <= y) && (y <= b[x])) {
					// 右のみに行く
					int nx = x, ny = y + 1;
					if ((nx <= h) && (ny < w) && (dp[nx][ny] > dp[x][y] + 1)) {
						dp[nx][ny] = dp[x][y] + 1;
						queue.add(new Data(nx, ny, dp[nx][ny]));
					}
				} else {
					// 右に行く
					int nx = x, ny = y + 1;
					if ((nx <= h) && (ny < w) && (dp[nx][ny] > dp[x][y] + 1)) {
						dp[nx][ny] = dp[x][y] + 1;
						queue.add(new Data(nx, ny, dp[nx][ny]));
					}
					// 下に行く
					nx = x + 1;
					ny = y;
					if ((nx <= h) && (ny < w) && (dp[nx][ny] > dp[x][y] + 1)) {
						dp[nx][ny] = dp[x][y] + 1;
						queue.add(new Data(nx, ny, dp[nx][ny]));
					}
				}
			}
		}
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
			return Integer.compare(dp, data.dp);
		}
	}
}
