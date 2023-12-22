import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			if(n==0)
				return;

			int a[]= new int[10];
			for(int i=0; i<10; i++)
				a[i]=0;

			while(n-->0)
			{
				int in = sc.nextInt();
				a[in]++;
			}

			for(int i=0; i<10; i++)
			{
				if(a[i] ==0)
					System.out.print("-");
				else
					for(int j=0; j<a[i]; j++)
						System.out.print("*");

				System.out.println();
			}

		}
	}
}