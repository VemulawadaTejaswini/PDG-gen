import java.util.*;
import java.io.*;

class Main {

	static final int INF = Integer.MAX_VALUE/2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int v = Integer.parseInt(line.substring(0,line.indexOf(" ")));
		int e = Integer.parseInt(line.substring(line.indexOf(' ')+1));

		int[][] d = new int[v][v];
		for (int i=0; i<v; i++) {
			Arrays.fill(d[i],-1);
		}

		for (int i=0; i<e; i++) {
			line = br.readLine();
			String[] str = line.split(" ");
			int si = Integer.parseInt(str[0]);
			int ti = Integer.parseInt(str[1]);
			int di = Integer.parseInt(str[2]);
			d[si][ti] = di;
		}

		int[][] dp = new int[1<<v][v];
		for (int i=0; i<1<<v; i++)
			Arrays.fill(dp[i],INF);
		dp[(1<<v)-1][0] = 0;

		for (int i=(1<<v)-2; i>=0; i--) {
			for (int j=0; j<v; j++) {
				for (int k=0; k<v; k++) {
					if ((i>>k&1) == 0 && d[j][k] != -1)
						dp[i][j] = Math.min(dp[i][j],dp[i|1<<k][k]+d[j][k]);
				}
			}
		}

		System.out.println(dp[0][0]>=INF?-1:dp[0][0]);

		br.close();
	}
}