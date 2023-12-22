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
		String b=in.next();
		ans=a*(b.charAt(0)-'0')*100+a*(b.charAt(2)-'0')*10+a*(b.charAt(3)-'0');
		System.out.println(ans/100);
	}
}
	