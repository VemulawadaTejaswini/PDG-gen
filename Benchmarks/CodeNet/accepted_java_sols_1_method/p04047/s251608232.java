import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int [2*n];
		int ans=0;
		for(int i=0;i<2*n;i++)
		{
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<2*n;i=i+2)
		{
			ans=ans+a[i];
		}
		System.out.println(ans);
	}
}
	