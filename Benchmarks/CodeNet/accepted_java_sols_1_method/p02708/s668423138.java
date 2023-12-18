
import java.io.*;
import java.util.*;
public class Main{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] cmd=br.readLine().split(" ");
		long x=Long.valueOf(cmd[0]);
		long k=Long.valueOf(cmd[1]);
		long[] sum1=new long[(int)x+2];
		for(long i=1;i<=x+1;i++)
		{
			sum1[(int)i]=sum1[(int)i-1]+i;
		}
		long[] sum2=new long[(int)x+2];
		for(long i=x+1;i>=1;i--)
		{
			sum2[(int)(x+2-i)]=sum2[(int)(x+1-i)]+i;
		}
		long ans=0;
		for(long i=k;i<=x+1;i++)
		{
			long diff=sum2[(int)i]-sum1[(int)i]+1;
			ans=(ans+diff)%1000000007;
		}
		System.out.println(ans);
	}

}
