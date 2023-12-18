import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		s = sb.reverse().toString();
		s = s + "0";
		char c[] = s.toCharArray();
		int n = s.length();
		int INF = Integer.MAX_VALUE/2;
		int dp[][] = new int[n+2][2]; //s下からi桁目までを決めた時の、最小利用枚数(j==0->繰り上がりなし、j==1->繰り上がりあり)
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<2;j++)dp[i][j] = INF;
		}
		dp[0][0] = 0;
		for(int i=0;i<n;i++) {
			int now = c[i] - '0';
			for(int j=0;j<2;j++) {
				now += j;
				for(int a = 0;a<10;a++) {
					int ni = i+1, nj = 0;
					int b = a - now;
					if(b < 0) {
						b += 10;
						nj = 1;
					}
					dp[ni][nj] = Math.min(dp[ni][nj], dp[i][j] + a + b);
				}
			}
		}
		int ans = dp[n][0];
		System.out.println(ans);
	}
}
