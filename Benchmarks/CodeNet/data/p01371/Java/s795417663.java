import java.util.*;

public class Main {
	
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0 ) break;
			int [][] data = new int[n][n+1];
			for(int i=0; i < n; i++){
				for(int j = 0; j < n+1; j++){
					data[i][j] = sc.nextInt();
				}
			}
			int len = 1 << n;
			int [] dp = new int[len];
			Arrays.fill(dp, INF);
			dp[0] = 0;
			
			for(int i=0; i < len; i++){
				for(int j = 0;j < n; j++){
					if((i & (1 << j)) == 0){
						//not use
						int ind = i | (1 << j) ;
						int value = dp[i] + data[j][0];
						dp[ind] = Math.min(dp[ind], value);
						//use
						for(int k = 0; k < n; k++){
							if((i & (1 << k)) == 0) continue;
							value = dp[i] + data[j][k+1];
							dp[ind] = Math.min(dp[ind], value);
						}
					}
				}
			}
			System.out.println(dp[len-1]);
		}
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}