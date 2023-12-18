import java.util.*;

public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] cy = new int[n];
			for(int i = 0; i < n; i++){
				cy[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int [] sche = new int[101];
			Arrays.fill(sche, 23);
			for(int i = 0; i < m; i++){
				int day = sc.nextInt();
				sche[day] = sc.nextInt();
			}
			
			int [][] dp = new int[101][n];
			int INF = 1 << 24;
			for(int i = 0; i < 101; i++){
				Arrays.fill(dp[i], INF);
			}
			dp[1][0] = 0;
			for(int i = 1; i < 100; i++){
				for(int j = 0; j < n; j++){
					if(dp[i][j] == INF) continue;
					if(cy[(j + 1) % n] <= sche[i + 1]){
						dp[i + 1][(j + 1) % n] = Math.min(dp[i][j], dp[i + 1][(j + 1) % n]);
					}
					dp[i + 1][0] = Math.min(dp[i + 1][0], dp[i][j] + 1);
				}
			}
			int min = INF;
			for(int i = 0; i < n; i++){
				min = Math.min(min, dp[100][i]);
			}
			System.out.println(min);
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}