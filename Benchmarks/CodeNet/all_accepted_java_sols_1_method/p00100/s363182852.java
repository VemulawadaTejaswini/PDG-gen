import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			boolean bl=false;
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			long b[]=new long[n];
			for(int i=0;i<n;i++)
			{
				a[i]=in.nextInt();
				b[i]=in.nextLong()*in.nextLong();
			}
			boolean ju[]=new boolean[n];
			Arrays.fill(ju, true);
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
					if(a[i]==a[j]&&ju[j])
					{
						b[i]=b[i]+b[j];
						ju[j]=false;
					}
			}
			for(int i=0;i<n;i++)
			{
				if(b[i]>=1000000&&ju[i])
				{
					System.out.println(a[i]);
					bl=true;
				}
			}
			if(!bl)
				System.out.println("NA");
		}
	}

}