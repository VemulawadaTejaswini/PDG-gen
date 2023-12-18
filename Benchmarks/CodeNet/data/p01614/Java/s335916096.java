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
			int m = sc.nextInt();
			int [] dataM = new int[m];
			for(int i = 0; i < m; i++){
				dataM[i] = sc.nextInt();
			}
			
			int [] dp = new int[394];
			for(int i = 0; i < n; i++){
				for(int j = data[i][0]; j <= data[i][1]; j++){
					dp[j] = Math.max(dp[j], data[i][2]);
				}
				for(int j = 0; j <= 393; j++){
					if(dp[j] == 0)continue;
					for(int k = data[i][0]; k <= data[i][1]; k++){
						int next = j + k;
						int value = dp[j] + data[i][2];
						if(next > 393) continue;
						dp[next] = Math.max(dp[next], value);
					}
				}
			}
			StringBuilder sb = new StringBuilder();
			boolean flg = true;
			for(int i = 0; i < m; i++){
				if(dp[dataM[i]] == 0){
					flg = false;
					break;
				}
				sb.append(dp[dataM[i]]+"\n");
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