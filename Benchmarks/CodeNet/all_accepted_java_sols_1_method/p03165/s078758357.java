import java.util.*;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int[][] dp = new int[s.length+1][t.length+1];
		for(int i = 1; i <= s.length; i++) {
			for(int j = 1; j <= t.length; j++) {
				if(s[i-1] == t[j-1])
					dp[i][j] = dp[i-1][j-1] + 1;
				else
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		StringBuilder ans = new StringBuilder();
		int i = s.length, j = t.length;
		while(i > 0 && j > 0){
			if(dp[i][j] == dp[i-1][j])
				i--;
			else if(s[i-1] == t[j-1]) {
				ans.append(s[i-1]);
				i--;
				j--;
			}
			else
				j--;
		}
		System.out.println(ans.reverse());
	}

}