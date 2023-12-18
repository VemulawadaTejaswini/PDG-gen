
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main{
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
		long[]ar=splitL();
		long n=ar[0];
		long x=ar[1];
		long m=ar[2];
		long ans=0;
		long[]sum=new long[1000001];
		int[] rem=new int[(int)m];
		int len=0;
		int r=0;
		long s=0;
		while(true)
		{
			r=(int)(x%m);
			if(rem[r]!=0)
				break;
			s+=r;
			len++;
			rem[r]=len;
			sum[len]=s;
			x=(long)((long)r*r);
		}
//		System.out.println(r+" "+rem[r]+" "+len);
		int cyc=len-rem[r]+1;
		long a=0;
		if(rem[r]!=0)
			a=sum[rem[r]-1];
		long b=sum[len];
		if(rem[r]!=0)
			b-=sum[rem[r]-1];
		n=n-rem[r]+1;
		long c=n/cyc;
		long d=n%cyc;
		long e=sum[(int)(rem[r]+d-1)]-sum[rem[r]-1];
		ans=a+b*c+e;
		System.out.println(ans);
	}
}
