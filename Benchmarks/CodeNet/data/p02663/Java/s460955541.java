import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			int a, b, c, d, e;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			int from = 0;
			int to = 0;
			from = a * 60 + b;
			to = c * 60 + d;
			System.out.println(to-from-e);

		}
	}
}