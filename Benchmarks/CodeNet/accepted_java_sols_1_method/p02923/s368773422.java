import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int prev=0;
		int ans=0;
		int max=0;
		for(int i=0;i<n;i++)
		{
			int curr=in.nextInt();
			if(curr<=prev)
			{
				prev=curr;
				ans++;
			}
			else
			{
				if(ans>max)
					max=ans;
				prev=curr;
				ans=0;
			}
		}
		max=Math.max(ans,max);
		System.out.println(max);
	}
}
	