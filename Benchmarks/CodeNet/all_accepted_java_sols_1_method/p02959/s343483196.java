import java.util.*;
import java.io.*;
//https://atcoder.jp/contests/abc135/tasks/abc135_c
//city savers
class Main
{
	public static void main(String args[])throws IOException
	{
		double n,max=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextDouble();
		double a[]=new double[(int)n+1];
		double b[]=new double[(int)n];
		for( i=0;i<n+1;i++)
		{
			a[(int)i]=sc.nextDouble();
		}

		for( i=0;i<n;i++)
			b[(int)i]=sc.nextDouble();
		for( i=n-1;i>=0;i--)
		{
			if(b[(int)i]<=a[(int)i+1])
			{
				max+=b[(int)i];
				a[(int)i+1]-=b[(int)i];
				b[(int)i]=0;

				
			}
			else if(b[(int)i]>a[(int)i+1])
			{
				max+=a[(int)i+1];
				b[(int)i]-=a[(int)i+1];
				a[(int)i+1]=0;
				if(b[(int)i]<=a[(int)i])
				{
					max+=b[(int)i];
					a[(int)i]-=b[(int)i];
					b[(int)i]=0;
				}
				else if(b[(int)i]>a[(int)i])
				{
					max+=a[(int)i];
					b[(int)i]-=a[(int)i];
					a[(int)i]=0;

				} 	
			}
			
		}
		
		System.out.println((long)max);
	}
}