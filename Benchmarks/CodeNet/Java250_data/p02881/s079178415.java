import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		long n=in.nextLong();
		long ans=0;
		for(int i=(int)Math.sqrt(n);i>0;i--)
		{
			if(n%i==0)
			{
				ans=ans+i+n/i-2;
				break;
			}
		}
		System.out.println(ans);
	}
}
	