import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] field = new int[n + 1][n + 1];
		int[][] sums = new int[n + 1][n + 1];
		for (int i = 0; i < m; i++) {
			field[sc.nextInt()][sc.nextInt()]++;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				sums[i][j] = field[i][j] + sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1];
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int pl = sc.nextInt();
			int pr = sc.nextInt();
			int ans = sums[pr][pr] - sums[pl - 1][pr] - sums[pr][pl - 1] + sums[pl - 1][pl - 1];
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}
