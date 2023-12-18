import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		long ans=1;
		while(ans<=n)
			ans<<=1;
		System.out.println(ans-1);
	}
}
	