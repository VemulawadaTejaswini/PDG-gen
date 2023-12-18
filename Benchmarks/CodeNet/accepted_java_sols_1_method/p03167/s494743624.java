import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.nextLine();

		char[][] g = new char[h][w];
		for (int i = 0; i < h; i++) {
			g[i] = sc.nextLine().toCharArray();
		}

		long[][] dp = new long[h][w];
		dp[0][0] = 1;

		int[][] d = {{0, 1}, {1, 0}};
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{0, 0});
		boolean[][] visited = new boolean[h][w];

		while (!q.isEmpty()) {
			int[] hw = q.poll();
			if (visited[hw[0]][hw[1]]) continue;
			visited[hw[0]][hw[1]] = true;

			for (int i = 0; i < d.length; i++) {
				int hi = hw[0] + d[i][0];
				int wi = hw[1] + d[i][1];
				if (hi >= 0 && wi >= 0 && hi < h && wi < w && g[hi][wi] == '.' && !visited[hi][wi]) {
					dp[hi][wi] = (dp[hi][wi] + dp[hw[0]][hw[1]]) % 1000000007;
					q.offer(new int[]{hi, wi});
				}
			}
		}

		//for (int i = 0; i < h; i++) {
		//	for (int j = 0; j < w; j++) {
		//		System.out.print(dp[i][j]);
		//		System.out.print(" ");
		//	}
		//	System.out.println();
		//}

		System.out.println(dp[h - 1][w - 1]);
	}
}
