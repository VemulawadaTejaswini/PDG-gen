import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		long n=in.nextLong();
		long ans=0;
		int [] prime = new int[1000001];
		for(int i=2;i<1000001;i++)
		{
			if(prime[i]==0)
			{
				for(int j=2;i*j<1000001;j++)
				{
					prime[i*j]=1;
				}
			}
		}
		for(long i=2;i*i<n;i++)
		{
			if(prime[(int)i]==0&&n%i==0)
			{
				int q=0;
				long t=n;
				while(t%i==0)
				{
					t=t/i;
					q++;
				}
				int j=0;
				while(j*(j+1)/2<=q)
				{
					j++;
				}
				ans=ans+j-1;
			}
		}
		if(ans==0&&n!=1)
		{
			ans++;
		}
		System.out.println(ans);
	}
}
	