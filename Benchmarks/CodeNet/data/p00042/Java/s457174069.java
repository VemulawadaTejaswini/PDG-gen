import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static int W, N;
	static int[] value, weight;
	static int[][]dp;
	public static void main(String[] args) {
		int count = 1;
		while(read()){
			slove();
			System.out.println("Case "+count+":");
			System.out.println(dp[N][W]);
			int index = 0;
			for(int i = 1; i <= W; i++){
				if(dp[N][i] == dp[N][W]){
					index = i;
					break;
				}
			}
			System.out.println(index-1);
			count++;
		}
	}
	static boolean read(){
		W = sc.nextInt();
		if (W==0)return false;
		
		N = sc.nextInt();
		
		dp = new int[N+1][W+1];
		value = new int[N+1];
		weight = new int[N+1];
		
		for(int i = 1; i <= N; i++){
			String[] in = sc.next().split(",");
			value[i] = Integer.parseInt(in[0]);
			weight[i] = Integer.parseInt(in[1]);
		}
		
		return true;
	}
	static void slove(){
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= W; j++){
				if(j < weight[i]){
					dp[i+1][j] = dp[i][j];
				}else{
					dp[i+1][j] = Math.max(dp[i][j], dp[i][j - weight[i]] + value[i]);
				}
			}
		}
		
	}
}