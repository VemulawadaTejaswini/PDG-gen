import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[][]ar=new int[n][3], dp=new int[n][3];
		StringTokenizer st;
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++){
				ar[i][j]=Integer.parseInt(st.nextToken());
				dp[i][j]=Integer.MIN_VALUE;
			}
		}
		for(int i=0;i<3;i++)dp[0][i]=ar[0][i];
		for(int i=1;i<n;i++){
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					if(k==j)continue;
					dp[i][j]=Math.max(dp[i][j], dp[i-1][k]+ar[i][j]);
				}
			}
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<3;i++)max=Math.max(max, dp[n-1][i]);
		System.out.println(max);
	}

}
