import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int q=in.nextInt();
		int [] ans=new int[n];
		for(int i=0;i<q;i++)
		{
			int ind=in.nextInt();
			ans[ind-1]++;
		}
		for(int i=0;i<n;i++)
		{
			if(ans[i]+k-q>0)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
		}
	}
}
	