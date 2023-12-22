
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
			if (i % 3 == 0)
			{
				System.out.print(" " + i);
				continue;
			}
			
			do
			{			
				
				if (x % 10 == 3)
				{
					System.out.print(" " + i);
					break;
					
				}
				x=x/10;
			}while(x>0);
		}
		System.out.println("");

	}

}