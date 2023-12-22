import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int [] a=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int [][] b = new int [m][2];
		for(int i=0;i<m;i++)
		{
			b[i][1]=in.nextInt();
			b[i][0]=in.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b, (c, d) -> Integer.compare(c[0], d[0]));
		int q=m-1;
		long sum=0;
		for(int i=0;i<n;i++)
		{
			if(b[q][1]==0&&q>0)
			{
				q--;
			}
			if(b[q][0]>a[i]&&b[q][1]>0)
			{
				sum=sum=sum+b[q][0];
				b[q][1]--;
			}
			else
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
	}

}