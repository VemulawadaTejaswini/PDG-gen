import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long a=in.nextLong();
		long b=in.nextLong();
		long ans=0;
		if((b-a)%2==1)
		{
			ans=Math.min(a-1,n-b)+1+(b-a-1)/2;
		}
		else
		{
			ans=(b-a)/2;
		}
		System.out.println(ans);
	}
}
	