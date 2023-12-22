import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		long[][] items = new long[N][2];
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			items[i][0] = Long.parseLong(str[0]);
			items[i][1] = Long.parseLong(str[1]);
		}
		long[] dp = new long[W+1];
		for(int i=0; i<N; i++) {
			long we = items[i][0];
			for(int j=(int)(W-we); j>=0; j--) {
				dp[(int)(j+we)] = Math.max(dp[(int)(j+we)], dp[j]+items[i][1]);
			}
		}
		long ans = 0;
		for(int i=0; i<=W; i++) {
			//System.out.print(dp[i]+" ");
			ans = Math.max(ans, dp[i]);
		}
//		System.out.println();
		System.out.println(ans);
	}
}
