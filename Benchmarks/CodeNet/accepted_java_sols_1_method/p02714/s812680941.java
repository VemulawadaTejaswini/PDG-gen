import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		String str=s.next();
		
		long[] r=new long[3*n];
		long[] g=new long[3*n];
		long[] b=new long[3*n];
		
		if(str.charAt(n-1)=='R')
		{
			r[n-1]=1;
		}
		else if(str.charAt(n-1)=='G')
		{
			g[n-1]=1;
		}
		else
		{
			b[n-1]=1;
		}
		
		for(int i=n-2;i>=0;i--)
		{
			if(str.charAt(i)=='R')
			{
				r[i]=r[i+1]+1;
				g[i]=g[i+1];
				b[i]=b[i+1];
			}
			else if(str.charAt(i)=='B')
			{
				r[i]=r[i+1];
				g[i]=g[i+1];
				b[i]=b[i+1]+1;
			}
			else
			{
				r[i]=r[i+1];
				g[i]=g[i+1]+1;
				b[i]=b[i+1];
			}
		}
		
		long ans=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(str.charAt(i)=='R')
				{
					if(str.charAt(j)=='B')
					{
						ans=ans+g[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='G')
							{
								ans--;
							}
						}
					}
					else if(str.charAt(j)=='G')
					{
						ans=ans+b[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='B')
							{
								ans--;
							}
						}
					}
				}
				else if(str.charAt(i)=='B')
				{
					if(str.charAt(j)=='R')
					{
						ans=ans+g[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='G')
							{
								ans--;
							}
						}
					}
					else if(str.charAt(j)=='G')
					{
						ans=ans+r[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='R')
							{
								ans--;
							}
						}
					}
				}
				else
				{
					if(str.charAt(j)=='R')
					{
						ans=ans+b[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='B')
							{
								ans--;
							}
						}
					}
					else if(str.charAt(j)=='B')
					{
						ans=ans+r[j+1];
						
						int check=j+j-i;
						
						if(check<n)
						{
							if(str.charAt(check)=='R')
							{
								ans--;
							}
						}
					}
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
}