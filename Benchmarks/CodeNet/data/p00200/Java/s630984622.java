import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int n, m, p, q, r;
	static int[][] cost, time;
	public static void main(String[] args) {
		while(read()){
			//solve();
		}
	}
	
	static boolean read(){
		n = sc.nextInt();
		m = sc.nextInt();
		if(n == 0 && m == 0)return false;
		
		cost = new int[m+1][m+1];
		time = new int[m+1][m+1];
		
		for(int formatting[] : cost)Arrays.fill(formatting, 1<<29);
		for(int formatting[] : time)Arrays.fill(formatting, 1<<29);
		
		for(int i = 1; i <= n; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			cost[a][b] = cost[b][a] = sc.nextInt();
			time[a][b] = time[b][a] = sc.nextInt();
		}
		
		solve();
		
		int k = sc.nextInt();
		for(int i = 0; i < k; i++){
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			res();
		}
		
		return true;
	}
	
	static void solve(){
		for(int k = 0; k <= m; k++){
			for(int i = 0; i <= m; i++){
				for(int j = 0; j <= m; j++){
					cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);
					time[i][j] = Math.min(time[i][j], time[i][k] + time[k][j]);
				}
			}
		}
	}
	
	static void res(){
		if(r == 0){
			System.out.println(cost[p][q]);
		}else{
			System.out.println(time[p][q]);
		}
	}

}