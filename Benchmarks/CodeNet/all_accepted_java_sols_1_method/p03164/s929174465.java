import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st =  new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), w=Integer.parseInt(st.nextToken()), tot=0;
		long[]ws=new long[n];
		int[]vs=new int[n];
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			ws[i]=Long.parseLong(st.nextToken());
			vs[i]=Integer.parseInt(st.nextToken());
			tot+=vs[i];
		}
		long[][]dp=new long[n][tot+1];
		for(int i=0;i<n;i++)Arrays.fill(dp[i], -1);
		dp[0][vs[0]]=ws[0];
		dp[0][0]=0;
		for(int i=1;i<n;i++){
			for(int j=0;j<=tot;j++){
				dp[i][j]=dp[i-1][j];
				if(j-vs[i]>-1&&dp[i-1][j-vs[i]]!=-1){
					if(dp[i][j]==-1)dp[i][j]=ws[i]+dp[i-1][j-vs[i]];
					else dp[i][j]=Math.min(dp[i][j], ws[i]+dp[i-1][j-vs[i]]);
				}
			}
		}
		for(int i=tot;i>=0;i--){
			for(int j=0;j<n;j++){
				if(dp[j][i]<=w&&dp[j][i]!=-1){
					System.out.println(i);
					return;
				}
			}
		}
	}
}