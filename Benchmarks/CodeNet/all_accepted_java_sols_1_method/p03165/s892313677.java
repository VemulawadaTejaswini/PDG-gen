import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			String S= scan.next();
			char[]s = S.toCharArray();
			String T = scan.next();
			char[]t = T.toCharArray();

			int[][]dp = new int[s.length+1][t.length+1];

			for(int i = 1;i<=s.length;i++) {
				for(int j = 1;j<=t.length;j++) {
					if(s[i-1]==t[j-1]) {
						dp[i][j] = dp[i-1][j-1]+1;
					}else {
						dp[i][j] =  Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}


			int len =  dp[s.length][t.length];
			StringBuffer sb = new StringBuffer();
			int i = s.length;
			int j = t.length;

			while(len>0) {
				if(s[i-1]==t[j-1]) {
					sb.append(s[i-1]);
					i--;
					j--;
					len--;
				}else if(dp[i][j]==dp[i-1][j]){
					i--;
				}else {
					j--;
				}

			}

			String ans = sb.reverse().toString();

			System.out.println(ans);









		}


	}


}
