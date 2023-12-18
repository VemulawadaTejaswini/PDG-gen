
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
	static BufferedReader br;
	static int cin() throws Exception
	{
		return Integer.valueOf(br.readLine());
	}
	static int[] split() throws Exception
	{
		String[] cmd=br.readLine().split(" ");
		int[] ans=new int[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Integer.valueOf(cmd[i]);
		}
		return ans;
	}
	static long[] splitL() throws IOException
	{
		String[] cmd=br.readLine().split(" ");
		long[] ans=new long[cmd.length];
		for(int i=0;i<cmd.length;i++)
		{
			ans[i]=Long.valueOf(cmd[i]);
		}
		return ans;
	}
	static long power(long x,long y,long p)
	{
		long res=1;
		x=x%p;
		while(y>0)
		{
			if((y&1)==1)
				res=(res*x)%p;
			y=(y>>1);
			x=(x*x)%p;
		}
		return res;
	}
	static long inv(long x,long p)
	{
		return power(x,p-2,p);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		br=new BufferedReader(new InputStreamReader(System.in));
		int[]ar=split();
		int n=ar[0];
		int k=ar[1];
		int[][]arr=new int[k][2];
		for(int i=0;i<k;i++)
		{
			ar=split();
			arr[i][0]=ar[0];
			arr[i][1]=ar[1];
		}
		int mod=998244353;
		int[]dp=new int[n];
		dp[0]=1;
		dp[1]=-1;
		for(int i=0;i<n;i++)
		{
			if(i>0)
				dp[i]=(dp[i]+dp[i-1])%mod;
			for(int j=0;j<k;j++)
			{
				int l=arr[j][0];
				int r=arr[j][1];
				if(i+l<n)
					dp[i+l]=(dp[i+l]+dp[i])%mod;
				if(i+r+1<n)
					dp[i+r+1]=((dp[i+r+1]-dp[i])%mod+mod)%mod;
			}
		}
//		int ans=0;
//		for(int i=0;i<n;i++)
//		{
//			ans=(ans+dp[i])%mod;
//		}
		System.out.println(dp[n-1]);
	}
}
