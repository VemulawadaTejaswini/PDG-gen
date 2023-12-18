import java.util.*;

public class Main {
	final int INF = 1 << 24;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			int [][] land = new int[n][n];
			int [][] sea = new int[n][n];
			for(int i=0; i < n; i++){
				Arrays.fill(land[i], INF);
				Arrays.fill(sea[i], INF);
				land[i][i] = 0;
				sea[i][i] = 0;
			}
			for(int i=0; i < m; i++){
				int from = sc.nextInt() -1;
				int to = sc.nextInt() -1;
				int dis = sc.nextInt();
				String mark = sc.next();
				if(mark.equals("L")){
					land[from][to] = dis;
					land[to][from] = dis;
				}
				else{
					sea[from][to] = dis;
					sea[to][from] = dis;
				}
			}
			int r = sc.nextInt();
			int [] route = new int[r];
			for(int i=0; i < r; i++){
				route[i] = sc.nextInt() -1;
			}
			
			for(int j = 0; j < n; j++){
				for(int i = 0; i < n; i++){
					for(int k = 0; k < n; k++){
						land[i][k] = Math.min(land[i][k], land[i][j] + land[j][k]);
						sea[i][k] = Math.min(sea[i][k], sea[i][j] + sea[j][k]);
					}
				}
			}
			
			int [][]dp = new int[n][r];
			for(int i = 0; i < n; i++){
				Arrays.fill(dp[i], INF);
			}
			dp[route[0]][0] = 0;
			for(int i=0; i < r-1; i++){
				int from = route[i];
				int to = route[i+1];
				for(int untilL = 0; untilL  < n; untilL++){
					for(int untilS = 0; untilS < n; untilS++){
						int currentDis = land[from][untilL] + sea[untilL][untilS] + land[untilS][to];
						dp[untilS][i+1] = Math.min(dp[untilS][i+1], dp[untilL][i] + currentDis);
					}
				}
			}
			
//			for(int i = 0; i < n;i ++){
//				for(int j = 0; j < r; j++ ){
//					if(dp[i][j] == INF){
//						System.out.print("INF ");
//					}
//					else{
//						System.out.print(dp[i][j] + " ");
//					}
//					
//				}
//				System.out.println();
//			}
			
			int ans = INF;
			for(int i = 0; i < n; i++){
				ans = Math.min(ans, dp[i][r-1]);
			}
			System.out.println(ans);
			
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}