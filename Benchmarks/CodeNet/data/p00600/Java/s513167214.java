import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			if (s == 0 && d == 0) break;
			int[][] lensd = new int[s][d];
			int[] min = new int[d];
			Arrays.fill(min, Integer.MAX_VALUE);
			for (int i = 0; i < s; ++i) {
				for (int j = 0; j < d; ++j) {
					lensd[i][j] = sc.nextInt();
					if (lensd[i][j] != 0) min[j] = Math.min(min[j], lensd[i][j]);
				}
			}
			int[][] lendd = new int[d][d];
			for (int i = 0; i < d; ++i) {
				for (int j = 0; j < d - i - 1; ++j) {
					lendd[i][i + j + 1] = lendd[i + j + 1][i] = sc.nextInt();
				}
			}
			boolean[] visited = new boolean[d];
			int ans = 0;
			for (int i = 0; i < d; ++i) {
				int minLen = Integer.MAX_VALUE;
				int minI = -1;
				for (int j = 0; j < d; ++j) {
					if (visited[j]) continue;
					if (min[j] < minLen) {
						minLen = min[j];
						minI = j;
					}
				}
				ans += minLen;
				visited[minI] = true;
				for (int j = 0; j < d; ++j) {
					if (visited[j] || lendd[minI][j] == 0) continue;
					min[j] = Math.min(min[j], lendd[minI][j]);
				}
			}
			System.out.println(ans);
		}
	}
}