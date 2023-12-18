import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		long[] ans=new long[2];
		while((str=br.readLine())!=null)
		{
			String[] aa=str.split(" ");
			long[] a=new long[aa.length];
			for(int i=0;i<aa.length;i++)
			{
				a[i]=Long.parseLong(aa[i]);
			}
			ans[0]=gcd(a[0],a[1]);
			ans[1]=(a[0]/ans[0])*a[1];

			System.out.printf("%d %d\n",ans[0],ans[1]);


		}
	}

	static long gcd(long a,long b)
	{
		if(b>0)
		{
			return gcd(b,a%b);
		}
		else
		{
			return a;
		}
	}
}