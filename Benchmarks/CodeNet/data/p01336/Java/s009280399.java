import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[][] dp;
	static String name;
	static int N, M;
	static int[] C, V, D, L;
	public static void main(String[] args) {
		while(read()){
			solve();
		}
	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		N = sc.nextInt(); M = sc.nextInt();
		dp = new int[N+1][M+1];
		C = new int[N]; V = new int[N]; D = new int[N]; L = new int[N];
		for(int i = 0; i < N; i++){
			String str;
			do{
				str = sc.next();
			}while(!Character.isDigit(str.charAt(0)));
			C[i] = Integer.parseInt(str);
			V[i] = sc.nextInt(); D[i] = sc.nextInt(); L[i] = sc.nextInt();
			}

		return true;
	}
	static void solve(){
		int ans = Math.max(selectVocal(), selectDance());
		ans = Math.max(ans, selectLooks());
		System.out.println(ans);
	}
	static int selectVocal(){
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= M; j++){
				if(j < C[i]){
					dp[i + 1][j] = dp[i][j];
				}else{
					dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - C[i]] + V[i]);
				}
			}
		}
		return dp[N][M];
	}
	static int selectDance(){
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= M; j++){
				if(j < C[i]){
					dp[i + 1][j] = dp[i][j];
				}else{
					dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - C[i]] + D[i]);
				}
			}
		}
		return dp[N][M];
	}
	static int selectLooks(){
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= M; j++){
				if(j < C[i]){
					dp[i + 1][j] = dp[i][j];
				}else{
					dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - C[i]] + L[i]);
				}
			}
		}
		return dp[N][M];
	}

}