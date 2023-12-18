
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a, b, c;
		Boolean t = true;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();

		if (a >= b)
			t = false;	
		if (b >= c)
			t = false;

		if (t)
			System.out.println("Yes");
		else
		{
			System.out.println("No");
		}

	}

}