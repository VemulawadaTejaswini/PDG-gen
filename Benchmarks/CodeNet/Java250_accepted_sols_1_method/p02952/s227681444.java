import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			int tep=i;
			int len=0;
			while(tep>0)
			{
				tep=tep/10;
				len++;
			}
			if(len%2==1)
			{
				ans++;
			}
		}
		System.out.println(ans);
	}
}
	