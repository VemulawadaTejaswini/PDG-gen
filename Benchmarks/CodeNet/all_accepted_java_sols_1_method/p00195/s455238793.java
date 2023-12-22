import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = 0, m = 0,max = 0, index = 0;
			int i;
			for (i = 0; i < 5; i++)
			{
				n = sc.nextInt();
				m = sc.nextInt();
				if (n == 0 && m == 0) System.exit(0);
				if (n + m > max)
				{
					index = i;
					max = n + m;
				}
			}
			if (n + m > max)
			{
				index = i;
				max = n + m;
			}
			System.out.printf("%c %d\n", 'A' + index, max);
		}
	}
}