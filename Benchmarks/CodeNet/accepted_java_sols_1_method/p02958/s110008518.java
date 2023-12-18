import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
    	int n=x.nextInt(),r=0;
    	int a[]=new int[n];
		int b[]= new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=x.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(b);
		for(int i=0;i<n;i++)
		{
			c[i]=b[i]-a[i];
			if(c[i]==0)
			{
				r++;
			}
		}
		if(r>=(n-2))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}