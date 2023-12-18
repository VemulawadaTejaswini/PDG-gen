import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), w=Integer.parseInt(st.nextToken());
		long[][]dp=new long[n][w+1];
		int[]ws=new int[n];
		long[]vs=new long[n];
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			ws[i]=Integer.parseInt(st.nextToken());
			vs[i]=Long.parseLong(st.nextToken());
		}
		dp[0][ws[0]]=vs[0];
		for(int i=1;i<n;i++){
			for(int j=0;j<=w;j++){
				dp[i][j]=dp[i-1][j];
				if(j-ws[i]>-1)dp[i][j]=Math.max(dp[i][j], vs[i]+dp[i-1][j-ws[i]]);
			}
		}
		long max=0;
		for(int i=0;i<=w;i++)max=Math.max(max,dp[n-1][i]);
		System.out.println(max);
	}
}
