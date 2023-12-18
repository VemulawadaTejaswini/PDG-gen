import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String arg[])
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			Arrays.sort(a);
			int sum=0;
			for(int i=1;i<a.length-1;i++)
				sum+=a[i];
			System.out.println(sum/(n-2));
		}
	}
}