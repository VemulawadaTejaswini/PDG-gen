import java.util.*;

public class Main {
	public static void main(String[]  args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int m[][] = new int[n][n];
		boolean fixed[] = new boolean[n];
		int d[] = new int[n];
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n; j ++) {
				m[i][j] = scanner.nextInt();
				if (m[i][j] < 0) m[i][j] = Integer.MAX_VALUE;
			}
			d[i] = Integer.MAX_VALUE;
		}
		
		scanner.close();
		
		d[0] = 0;
		int u = 0;
		int sum = 0;
		
		for(int i = 0; true; i ++) {
			int mincost = Integer.MAX_VALUE;
			
			for (int j = 0; j < n; j ++) {
				if (fixed[j] == false && d[j] < mincost) {
					mincost = d[j];
					u = j;
				}
			}
			
			fixed[u] = true;
			sum += mincost;
			if (i == n - 1) break;
			
			for (int j = 0; j < n; j ++) {
				if (fixed[j] == false && m[u][j] < d[j]) {
					d[j] = m[u][j];
				}
			}
		}
		
		System.out.println(sum);
	}
} 

