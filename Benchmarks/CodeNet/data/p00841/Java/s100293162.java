import java.util.*;

public class Main{
	//0438 start
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			int [] data = new int[n+1];
			for(int i = 1; i <= n;i++){
				data[i] = sc.nextInt();
			}
			double b  = sc.nextDouble();
			int r = sc.nextInt();
			double v = sc.nextDouble();
			double e = sc.nextDouble();
			double f = sc.nextDouble();
			
			double [][] dp = new double[n][n+1];
			int INF = 1 << 24;
			for(int i = 0; i < n; i++){
				Arrays.fill(dp[i], INF);
			}
			
			dp[0][0] =0;
			
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					if(dp[j][i] == INF) continue;
					
					
					//sonomama
					double sum = 0.0;
					for(int k = data[i]; k < data[i+1]; k++){
						int x  = k - data[j];
						double value;
						if(x >= r){
							value = 1.0 / (v - e * (x - r));
						}
						else{
							value = 1.0 / (v - f * (r - x));
						}
						//System.out.println("x = " + x + " value = " + value + " i = " + i);
						sum += value;
					}
					dp[j][i+1] = Math.min(dp[j][i+1], sum + dp[j][i]);
					
					//keiyu
					double sum2 = 0.0;
					for(int k = data[i]; k < data[i+1]; k++){
						int x = k - data[i];
						double value;
						if(x >= r){
							value = 1.0 / (v - e * (x - r));
						}
						else{
							value = 1.0 / (v - f * (r - x));
						}
						sum2 += value;
					}
					sum2 += b;
					dp[i][i+1] = Math.min(dp[i][i+1], sum2 + dp[j][i]);
				}
			}
			double min = INF;
			for(int i = 0; i < n; i++){
				min = Math.min(min, dp[i][n]);
			}
			
			//debug
//			for(int i = 0; i < n; i++){
//				for(int j = 0; j <= n; j++){
//					System.out.printf("%.4f ",dp[i][j]);
//				}
//				System.out.println();
//			}
			
			System.out.printf("%.4f\n",min);
		}
	}
	
	public static void main(String[] args) {
		new Main().doit();
	}
}