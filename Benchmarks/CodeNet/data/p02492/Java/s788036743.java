import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args)
	{
		int flg = 0;
		
		try
		{
			do
			{
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				String op = sc.next();
				int b = sc.nextInt();
				
				switch(op.charAt(0))
				{
					case '+':
						System.out.println(a + b);
						break;
					case '-':
						System.out.println(a - b);
						break;
					case '*':
						System.out.println(a * b);
						break;
					case '/':
						System.out.println(a / b);
						break;
					case '?':
						flg++;
						break;
				}
			} while(flg == 0);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}
}