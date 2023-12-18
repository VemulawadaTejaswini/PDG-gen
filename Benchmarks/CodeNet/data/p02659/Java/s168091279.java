import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		long ans=1;
		int flag=0;
		Scanner in = new Scanner(System.in);
		long a=in.nextLong();
		float b=in.nextFloat();
		b=100*b;
		long c=(long)b;
		ans=a*c;
		ans=ans/100;
		System.out.println(ans);
	}
}
	