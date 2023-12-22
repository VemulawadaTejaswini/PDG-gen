import java.util.*;
public class Main {
	static final long mod = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		long[][] dp = new long[s.length][13];
		if(s[0] == '?'){
			for(int d = 0; d < 10; d++){
				dp[0][d] = 1;
			}
		}
		else{
			dp[0][s[0]-'0'] = 1;
		}
		for(int i = 1; i < s.length; i++){
			if(s[i] == '?'){
				for(int d = 0; d < 10; d++){
					for(int e = 0; e < 13; e++){
						dp[i][(10*e+d)%13] = (dp[i][(10*e+d)%13] + dp[i-1][e]) % mod;
					}
				}
			}
			else{
				for(int e = 0; e < 13; e++){
					dp[i][(10*e+s[i]-'0')%13] = (dp[i-1][e] + dp[i][(10*e+s[i]-'0')%13]) % mod;
				}
			}
		}
		System.out.println(dp[s.length-1][5]);
	}
}
