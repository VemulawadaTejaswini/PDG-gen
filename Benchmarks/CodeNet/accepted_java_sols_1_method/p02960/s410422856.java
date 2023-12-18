
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char []c = sc.next().toCharArray();
		
		int n = c.length;
		
		int [][]dp = new int [n+1][13];
		
		dp[0][0] = 1;
		
		for(int i = 0 ;i < n ;i++) {
			for(int j = 0 ; j < 10 ; j++) {
				if(c[i] == '?' || c[i] == j +'0') {
					for(int k = 0 ; k < 13 ;k++) {
						dp[i+1][(k*10+j)%13] = (dp[i+1][(k*10+j)%13] + dp[i][k])%mod;
					}
				}
			}
		}
		
		System.out.println(dp[n][5]);
	}
}
