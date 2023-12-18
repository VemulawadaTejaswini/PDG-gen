import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		long [][][] dp = new long[10][1001][101];

		for(int i = 0; i < 101; ++i){
			dp[1][i][i] = 1;
		}
		
		for(int i = 1; i < 9; ++i){
			for(int j = 0; j < 1001; ++j){
				for(int k = 0; k < 101; ++k){
					for(int l = k+1; l <= 100; ++l){
						if( j+l < 1001 ) {
							dp[i+1][j+l][l] += dp[i][j][k];
						}
					}
				}
			}
		}
				
		
		while(sc.hasNextInt()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int res = 0;
			
			if( n == 0 && s == 0 ) break;
			
			for(int i = 0; i < 101; ++i){
				res += dp[n][s][i];
			}
			
			
			System.out.println(res);
		}
	}
}