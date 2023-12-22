import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int max=0;
		int maxin=0;
		int sec=0;
		for(int i=0;i<n;i++)
		{
			int a=in.nextInt();
			if(a>=max)
			{
				sec=max;
				max=a;
				maxin=i;
			}
			else if(a<max&&a>sec)
			{
				sec=a;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i!=maxin)
			{
				System.out.println(max);
			}
			else
			{
				System.out.println(sec);
			}
		}
		
	}
}
	