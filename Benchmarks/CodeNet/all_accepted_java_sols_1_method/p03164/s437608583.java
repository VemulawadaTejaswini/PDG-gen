import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int W = Integer.parseInt(str[1]);
		long[][] items = new long[N][2];
		int sum_value = 0;
		for(int i=0; i<N; i++) {
			str = br.readLine().split(" ");
			items[i][0] = Long.parseLong(str[0]);
			items[i][1] = Long.parseLong(str[1]);
			sum_value += items[i][1];
		}
		long[] dp = new long[sum_value+1];
		for(int i=0; i<=sum_value; i++) dp[i] = (long)1e18;
		dp[0]=0;
		for(int item=0; item<N; item++) {
			long val = items[item][1];
			for(int already_value = sum_value-(int)val; already_value>=0; already_value--) {
				dp[(int)val+already_value] = Math.min(dp[(int)val+already_value], 
												dp[already_value]+items[item][0]);
			}
		}
		long ans = -1;
		for(int i=0; i<=sum_value; i++) {
			//System.out.print(dp[i]+" ");
			if(dp[i]<=W) ans = i;
		}
		System.out.println(ans);
	}
}
