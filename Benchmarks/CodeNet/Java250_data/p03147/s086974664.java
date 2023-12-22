

import java.util.Scanner;

public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		
		int ans=0;
		int pre=0;
		int cur;
		
		for(int i=0;i<n;i++)
		{
			int curr=scan.nextInt();
			if(pre>curr)
			{
				ans+=pre-curr;
			}
			pre=curr;
		}
		ans+=pre;
		System.out.println(ans);
	}
}
