import java.util.*;
class Main{
	static Scanner input = new Scanner(System.in);
	static long Mod = 1000000007;
	public static void main(String[] args){
		String s = input.nextLine();
		long dp[][] = new long[13][s.length()+1];
		dp[0][0] = 1;
		for(int i = 1 ;i <= s.length() ; i++){
			for(int r = 0 ;r < 13 ; r++){
				if(s.charAt(i-1) == '?'){
					for(int curr = 0 ; curr < 10 ; curr++){
						dp[(r*10 + curr)%13][i] += dp[r][i-1];
						if(dp[(r*10 + curr)%13][i] >= Mod)
							dp[(r*10+ curr)%13][i] -= Mod;
					}
				}
				else{
					int curr = s.charAt(i-1)-'0';
					dp[(r*10+curr)%13][i] += dp[r][i-1];
					if(dp[(r*10 + curr)%13][i] >= Mod)
						dp[(r*10 + curr)%13][i] -= Mod;
				}
			}
		}
		System.out.println(dp[5][s.length()]);
	}
}