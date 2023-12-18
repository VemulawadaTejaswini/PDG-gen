import java.util.*;

public class Main{

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int l = sc.nextInt();
			int [][] data = new int[n][3];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					data[i][j] = sc.nextInt();
				}
			}
			double [][][] dp = new double[n][m+1][m+1];
			for(int i = 0; i < n; i++){
				dp[i][0][0] = 1.0;
				for(int j = 0; j < m; j++){
					for(int k = 0; k < m; k++){
						dp[i][j + 1][k] += dp[i][j][k] * (100 - data[i][0]) / 100;
						dp[i][j + 1][k+1] += dp[i][j][k] * (data[i][0]) / 100;
					}
				}
			}

			for(int i = 0; i < n; i++){
				double prob = 0;
				for(int j = 0; j <= m; j++){
					double sec = (double) l / data[i][2] + j * data[i][1];
					double nowsum = dp[i][m][j];
					for(int k = 0; k < n; k++){
						if(i == k) continue;
						double sum2 = 0;
						for(int kk = 0; kk <= m; kk++){
							double opsec = (double) l / data[k][2] + kk * data[k][1];
							if(opsec > sec){
								sum2 += dp[k][m][kk];
							}
						}
						nowsum *= sum2;
					}
					prob += nowsum;
				}
				System.out.printf("%.6f\n",prob);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}