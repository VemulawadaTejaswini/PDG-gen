import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			for(int i = 1; ; i++)
			{
				int x = sc.nextInt();
				
				if(x == 0)
				{
					break;
				}
				else
				{
					System.out.println("Case " + i + ": " + x);
				}
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}