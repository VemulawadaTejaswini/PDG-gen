import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n= sc.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			int inde=0;
			int maxinde=0;
			int sum=0;
			int max=0;
			while(n-->0)
			{
					inde=sc.nextInt();
					sum = sc.nextInt()+sc.nextInt();
				if(sum>max)
				{
					max=sum;
					maxinde=inde;
				}
			}
			System.out.println(maxinde+" "+max);
		}
	}
}