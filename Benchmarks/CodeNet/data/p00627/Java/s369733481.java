import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			if(n==0)
				return;

			int sum=0;

			for(int i=0; i<n/4; i++)
			{
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}
	}
}