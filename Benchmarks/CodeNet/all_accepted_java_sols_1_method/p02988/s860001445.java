import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int [] p=new int [n];
		for(int i=0;i<n;i++)
		{
			p[i]=in.nextInt();
		}
		int ans=0;
		for(int i=1;i<n-1;i++)
		{
			if((p[i]>p[i-1]&&p[i]<p[i+1])||(p[i]>p[i+1]&&p[i]<p[i-1]))
			{
				ans++;
			}
		}
		System.out.println(ans);
	}
}
	