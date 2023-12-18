import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			String str = sc.next();
			if (str.charAt(0) == '0') break;
			int a = 0, b = 0;
			int length = str.length();
			for (int i = 1; i < length; i++)
			{
				if (str.charAt(i) == 'A')
					a++;
				else
					b++;
			}
			if (a > b)
				System.out.printf("%d %d\n", a+1, b);
			else
				System.out.printf("%d %d\n", a, b+1);
		}
	}
}