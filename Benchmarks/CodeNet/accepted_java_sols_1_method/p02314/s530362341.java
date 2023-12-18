import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {

		final int INF = Integer.MAX_VALUE/2;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int m = Integer.parseInt(line.substring(line.indexOf(" ")+1));

		line = br.readLine();
		String[] str = line.split(" ");
		int[] d = new int[m];
		for (int i=0; i<m; i++) {
			d[i] = Integer.parseInt(str[i]);
		}

		int[] dp = new int[n+1];
		Arrays.fill(dp,INF);
		dp[0] = 0;

		for (int i=0; i<=n; i++) {
			for (int j=0; j<m; j++) {
				if (0 <= i - d[j]) {
					dp[i] = Math.min(dp[i],dp[i-d[j]]+1);
				}
			}
		}

		System.out.println(dp[n]);

		br.close();
	}
}