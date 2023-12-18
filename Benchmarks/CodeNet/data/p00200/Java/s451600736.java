import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if ((n | m) == 0)
				break;
			int time[][] = new int[m + 1][m + 1];
			int cost[][] = new int[m + 1][m + 1];
			for (int i = 0; i < m + 1; i++) {
				Arrays.fill(time[i],Integer.MAX_VALUE/2);
				Arrays.fill(cost[i], Integer.MAX_VALUE/2);
				time[i][i] = 0;
				cost[i][i] = 0;
			}
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int t = sc.nextInt();
				cost[a][b] = cost[b][a] = c;
				time[a][b] = time[b][a] = t;
			}
			for (int k = 1; k < m + 1; k++) {
				for (int i = 1; i < m + 1; i++) {
					for (int j = 1; j < m + 1; j++) {
						cost[i][j] = Math.min(cost[i][j], cost[i][k]
								+ cost[k][j]);
						time[i][j] = Math.min(time[i][j], time[i][k]
								+ time[k][j]);
					}
				}
			}
			int k = sc.nextInt();
			for (int i = 0; i < k; i++) {
				int p = sc.nextInt();
				int q = sc.nextInt();
				int r = sc.nextInt();
				System.out.println(r == 0 ? cost[p][q] : time[p][q]);
			}
		}
	}
}