import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n+5];
		Arrays.fill(a,0);
		for(int i=1;i<=n;i++)
			a[i]=in.nextInt();
		in.close();
		int[] dp=new int[n+5];
		Arrays.fill(dp,1);
		dp[0]=0;
		for(int i=1;i<=n;i++)
			for(int j=0;j<n;j++)
				if(a[j]<a[i])
					dp[i]=Math.max(dp[i],dp[j]+1);
		int ans=0;
		for(int i=1;i<=n;i++)
			ans=Math.max(dp[i],ans);
		System.out.println(ans);
	}

}