import java.util.*;
import java.awt.geom.*;

public class Main{
	double EPS = 1.0e-08;

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int [][] data = new int[n][3];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 3; j++){
					data[i][j] = sc.nextInt();
				}
			}
			
			int [][] dp = new int[n + 1][394];
			for(int i = data[0][0]; i <= data[0][1]; i++){
				dp[0][i] = data[0][2];
			}
			for(int i = 0;i < n-1; i++){
				for(int j = data[i+1][0] ; j <= data[i+1][1]; j++){
					dp[i+1][j] = data[i+1][2];
				}
				for(int j = 0; j <= 393; j++){
					if(dp[i][j] == 0) continue;
					dp[i + 1][j] = Math.max(dp[i+1][j], dp[i][j]);
					for(int k = data[i+1][0]; k <= data[i+1][1]; k++){
						int next = j + k;
						if(next > 393) continue;
						dp[i + 1][next] = Math.max(dp[i + 1][next], dp[i][j] + data[i+1][2]);
					}
				}
			}
			
			int m = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			boolean flg = true;
			for(int i = 0; i < m; i++){
				int w = sc.nextInt();
				if(dp[n-1][w] == 0){
					flg = false;
					break;
				}
				sb.append(dp[n-1][w] + "\n");
			}
			if(flg){
				System.out.print(sb.toString());
			}
			else{
				System.out.println(-1);
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