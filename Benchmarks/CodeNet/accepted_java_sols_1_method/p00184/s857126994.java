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
			int a[] = new int[8];

			for(int i=0; i<n; i++)
			{
				int x = sc.nextInt();
				if(x<10)
				{
					a[1]++;
					continue;
				}
				else if(x<20)
				{
					a[2]++;
					continue;
				}
				else if(x<30)
				{
					a[3]++;
					continue;
				}	
				else if(x<40)
				{
					a[4]++;
					continue;
				}	
				else if(x<50)
				{
					a[5]++;
					continue;
				}	
				else if(x<60)
				{
					a[6]++;
					continue;
				}	
				else
				{
					a[7]++;
					continue;
				}	
			}
			for(int i=1; i<8;i++)
				System.out.println(a[i]);
		}
	}
}