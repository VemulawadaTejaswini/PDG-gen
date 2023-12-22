import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt(),k=in.nextInt();
			int a[]=new int[n];
			int pre=0;
			if((n|k)==0)
				return;
			for(int i=0;i<n;i++)
				a[i]=in.nextInt();
			for(int i=0;i<k;i++)
				pre+=a[i];
			int max=pre;
			
			for(int i=0;i<n-k;i++)
			{
				pre=pre-a[i]+a[k+i];
				max=Math.max(max, pre);
			}
			System.out.println(max);
		}
	}
}