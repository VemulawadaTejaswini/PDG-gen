import java.util.*;
public class Main{

	public static void main(String[]agrs){
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			double[][] list = new double[n][n];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					list[i][j] = sc.nextDouble();
				}
			}
			
			double dp[][] = new double[m][n];
			Arrays.fill(dp[0], 1);
			for(int i = 1; i < m; i++) {
				for(int j = 0; j < n; j++) {
					for(int k = 0; k < n; k++) {
						dp[i][j] = Math.max(dp[i][j], dp[i-1][k] * list[k][j]);
					}
				}
			}
			double max = 0;
			for(int i = 0; i < n; i++) {
				max = Math.max(dp[m-1][i],max);
			}
			
			System.out.printf("%.2f\n",max);
		}
	}
}