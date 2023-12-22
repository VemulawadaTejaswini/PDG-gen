import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		long mod=0;
		int n=in.nextInt();
		int p=in.nextInt();
		String s=in.next();
		int [] r=new int [p];
		long ans=0;
		long pow=1;
		for(int i=n-1;i>=0;i--)
		{
			int t=s.charAt(i)-'0';
			if(p==2||p==5)
			{
					if(t%p==0)
					{
						ans=ans+i+1;
					}
			}
			else
			{
				mod=(mod+t*pow)%p;
				pow=(pow*10)%p;
				if(mod==0)
					ans++;
				ans=ans+r[(int)mod];
				r[(int)mod]++;
			}
		}
		System.out.println(ans);
	}
}
	