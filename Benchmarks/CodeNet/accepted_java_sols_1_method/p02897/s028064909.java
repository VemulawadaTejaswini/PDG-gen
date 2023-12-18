import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		double ans;
		ans=n/2;
		ans=ans+(double)(n%2);
		System.out.println(ans/(double)n);
		
	}
}
	