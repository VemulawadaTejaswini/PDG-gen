import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int INF = 1 << 28;
		while (true) {
			int n = sc.nextInt();
			if(n==0)break;
			int m = 10;
			int time[][] = new int[m][m];
			for (int i = 0; i < m; i++) {
				Arrays.fill(time[i], INF);
				time[i][i] = 0;
			}
			int max = 0;
			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				int t = sc.nextInt();
				time[a][b] = time[b][a] = t;
				max = Math.max(max, a);
				max = Math.max(max, b);
			}
			for (int k = 0; k < m; k++) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						time[i][j] = Math.min(time[i][j], time[i][k]
								+ time[k][j]);
					}
				}
			}
			int min = INF;
			int num = 0;
			for (int i = 0; i < max + 1; i++) {
				int sum = 0;
				for (int j = 0; j < max + 1; j++) {
					sum += time[i][j];
				}
				if (min > sum) {
					num = i;
					min = sum;
				}
			}
			System.out.println(num + " " + min);
		}
	}
}