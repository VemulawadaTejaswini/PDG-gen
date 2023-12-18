import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String nstr=br.readLine();
		int n=Integer.parseInt(nstr);
		long sum=0;
		for(long i=1;i<=n;i++)
		{
			sum+=i*f(i);
		}
		System.out.println(sum);
		br.close();
	}
	
	public static long f(long x)
	{
		long cnt=0;
		for(long i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				cnt++;
			}
		}
		return cnt;
	}
}
