import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken()), k=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[]ar=new int[n],dp=new int[n];
		for(int i=0;i<n;i++)ar[i]=Integer.parseInt(st.nextToken());
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0]=0;
		for(int i=1;i<n;i++){
			for(int j=1;j<=k;j++){
				if(i-j<0)break;
				dp[i]=Math.min(dp[i], dp[i-j]+Math.abs(ar[i]-ar[i-j]));
			}
		}
		System.out.println(dp[n-1]);
	}

}
