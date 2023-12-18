
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++)
		{
			int x = i;
			if (x % 3 == 0)
			{
				System.out.print(" " + x);
			} else if(x>0)
			{
				
				if (x % 10 == 3)
				{
					System.out.print(" " + x);
					
				}
				x=x/10;
			}
		}
		System.out.println("");

	}

}