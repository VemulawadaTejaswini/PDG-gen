import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			if(n==0)
				return;
			int a[]=new int[n];
			int max=Integer.MIN_VALUE;
			for(int i=0;i<n;i++)a[i]=in.nextInt();
			for(int i=0;i<n;i++)
			{
				int sum=0;
				for(int j=i;j<n;j++)
				{
					sum+=a[j];
					max=Math.max(sum, max);
				}
			}
			System.out.println(max);
		}
	}
}