import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int [n+n];
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=n;j++)
			{
				for(int k=1;k<=n;k++)
				{
					int b=(i*i)+(j*j)+(k*k)+(i*j)+(j*k)+(k*i);
					if(b<=n)
						a[b]=a[b]+1;
					else
						break;
				}
			}
		}
		for(int i=1;i<=n;i++)
			System.out.println(a[i]);		
	}
}
