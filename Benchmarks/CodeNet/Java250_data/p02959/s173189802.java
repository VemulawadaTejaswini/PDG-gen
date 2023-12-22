import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int [n+1];
		int [] b=new int [n];
		for(int i=0;i<=n;i++)
		{
			a[i]=in.nextInt();

		}
		for(int i=0;i<n;i++)
		{			
			b[i]=in.nextInt();
		}
		long ans=0;
		if(a[n]>b[n-1])
		{
			ans=b[n-1];
			b[n-1]=0;
		}
		else
		{
			ans=a[n];
			b[n-1]=b[n-1]-a[n];
		}
		for(int i=n-1;i>0;i--)
		{
			if(a[i]-b[i]>0)
			{
				if(a[i]-b[i-1]-b[i]>0)
				{
					ans=ans+b[i]+b[i-1];
					b[i-1]=0;
				}
				else
				{
					ans=ans+a[i];
					b[i-1]=b[i-1]+b[i]-a[i];
				}
			}
			else
			{
				ans=ans+a[i];
			}
		}
		if(a[0]>b[0])
		{
			ans=ans+b[0];
		}
		else
		{
			ans+=a[0];
		}
		System.out.println(ans);
			
	}
}
	