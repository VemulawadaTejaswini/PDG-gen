import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		int ans=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(a[k]<a[i]+a[j])
					{
						ans++;
					}
					else
					{
						k=n;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
	