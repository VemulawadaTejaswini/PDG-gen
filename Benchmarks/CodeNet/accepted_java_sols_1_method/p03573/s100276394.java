import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		int a = console.nextInt();
		int b = console.nextInt();
		int c = console.nextInt();

		if(a == b)
		{
			System.out.print(c);
		}
		else if(a == c)
		{
			System.out.print(b);
		}
		else
		{
			System.out.print(a);
		}
	}
}