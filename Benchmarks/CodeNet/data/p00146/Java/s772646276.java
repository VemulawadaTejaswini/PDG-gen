
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt();

		int hash[] = new int[n];
		int dist[] = new int[n];
		int weight[] = new int[n];

		for (int i = 0; i < n; i++) {
			hash[i] = sc.nextInt();
			dist[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}

		double[][] dp = new double[1 << n][n];
		double[][] dpw = new double[1 << n][n];
		String[][] str = new String[1<<n][n];
		
		for (int i = 0; i < 1 << n; i++) {
			Arrays.fill(dp[i], Double.MAX_VALUE);
			Arrays.fill(dpw[i], Double.MAX_VALUE);
		}

		for (int i = 0; i < n; i++) {
			int shi = 1 << i;
			dp[shi][i] = dist[i] * 7;
			dpw[shi][i] = 7 + weight[i];
			str[shi][i] = String.valueOf(hash[i]);
		}

		for (int i = 1; i < 1 << n; i++) {
			for (int j = 0; j < n; j++) {
				int shj = 1 << j;
				if ((i & shj) == 0) {
					continue;
				}

				int dept = i & ~shj;
				for (int k = 0; k < n; k++) {
					int shk = 1<<k;
					if ((dept & shk) == 0) {
						continue;
					}
					if (dp[i][j] > dp[dept][k] + Math.abs(dist[k] - dist[j])
							* dpw[dept][k]) {
						dp[i][j] = dp[dept][k] + Math.abs(dist[k] - dist[j])
								* dpw[dept][k];
						dpw[i][j] = dpw[dept][k] + weight[j];
						str[i][j] = str[dept][k]+" "+hash[j];
					}
				}
			}
		}
		String ret ="" ;
		double min = Double.MAX_VALUE;
//		System.out.println(Arrays.deepToString(dp));
		for(int i = 0; i < n ; i++){
			if(min > dp[(1<<n) -1][i]){
				min = dp[(1<<n) -1][i];
				ret = str[(1<<n) -1][i];
			}
		}
		System.out.println(ret);
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}