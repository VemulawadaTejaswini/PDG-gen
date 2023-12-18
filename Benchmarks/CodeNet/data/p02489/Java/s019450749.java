import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			for(int i = 1; ; i++)
			{
				Scanner sc = new Scanner(System.in);
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