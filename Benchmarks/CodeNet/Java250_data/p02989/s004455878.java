import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int [] p=new int [n];
		for(int i=0;i<n;i++)
		{
			p[i]=in.nextInt();
		}
		int ans=0;
		Arrays.sort(p);
		System.out.println(p[n/2]-p[n/2-1]);
	}
}
	