import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(), r, i = 2, x = n * 2;
		scan.close();
		if (n < 2)
		{
			System.out.println(2);
		}
		else
		{
			r = n % 2;
			while (r != 0)
			{
				n = i;
				i = r;
				r = n % i;
			}
			System.out.println(x / i);
		}
	}
}

