import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double ans=0.0;
		int [] x=new int [n];
		int [] y=new int [n];
		for(int i=0;i<n;i++)
		{
			x[i]=in.nextInt();
			y[i]=in.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					double q=Math.pow((x[i]-x[j]),2)+Math.pow((y[i]-y[j]),2);
					ans=ans+Math.sqrt(q);
				}
			}
		}
		ans=ans/n;
		System.out.println(ans);
	}
}
	