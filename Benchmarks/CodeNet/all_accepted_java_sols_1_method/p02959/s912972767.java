

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n+1];
		for(int i=0;i<=n;i++)
		{
			ar[i]=scan.nextInt();
		}
		int br[]=new int[n];
		for(int i=0;i<n;i++)
		{
			br[i]=scan.nextInt();
		}
		long ans=0;
		for(int i=0;i<n;i++)
		{
			int cur=br[i];
			int max=Math.min(ar[i],cur);
			ans+=max;
			cur-=max;
			int sec=Math.min(cur,ar[i+1]);
			ar[i+1]=ar[i+1]-sec;
			ans+=sec;
			
		}
		System.out.println(ans);
	}
}
