import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int[][] d = new int[10][10];
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					d[i][j] = (i == j) ? 0 : Integer.MAX_VALUE / 2;
				}
			}
			int m = 0;
			for (; n > 0; n--) {
				int a = in.nextInt();
				int b = in.nextInt();
				int c = in.nextInt();
				d[a][b] = c;
				d[b][a] = c;
				m = Math.max(m, a + 1);
				m = Math.max(m, b + 1);
			}
			
			for (int k = 0; k < m; k++) {
				for (int i = 0; i < m; i++) {
					for (int j = 0; j < m; j++) {
						d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
					}
				}
			}
			int ans = -1, min = Integer.MAX_VALUE;
			for (int i = 0; i < m; i++) {
				int sum = 0;
				for (int j = 0; j < m; j++) {
					sum += d[i][j];
				}
				if (sum < min) {
					ans = i;
					min = sum;
				}
			}
			
			System.out.println(ans + " " + min);
		}
	}
}