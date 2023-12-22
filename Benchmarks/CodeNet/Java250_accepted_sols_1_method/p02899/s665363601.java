import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] ans=new int [n];
		for(int i=0;i<n;i++)
		{
			int t=in.nextInt()-1;
			ans[t]=i;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+1+" ");
		}
	}
}
	