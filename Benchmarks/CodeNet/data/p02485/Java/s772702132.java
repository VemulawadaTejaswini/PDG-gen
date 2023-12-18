import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			int sum;
			
			while(true)
			{
				String x = sc.next();
				if(x.charAt(0) == '0')
				{
					break;
				}
				
				sum = 0;
				for(int i = 0; i < x.length(); i++)
				{
					sum += x.charAt(i) - '0';
				}
				System.out.println(sum);
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}