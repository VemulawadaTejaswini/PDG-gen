import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String a = sc.next();
			char x[] = a.toCharArray();
			int p = 0;
			int d = 0;
			for (int i = 0; i < x.length; i++)
			{
				if (x[i] == 'P')
				{
					p++;
				}
				if (x[i] == 'D')
				{
					d++;
				}
			}
			for (int i = 0; i < x.length; i++)
			{
				if (p <= d)
				{
					if (x[i] == '?')
					{
						x[i] = 'P';
					}

				} else
				{
					if (x[i] == '?')
					{
						x[i] = 'D';
					}
				}
			}

			for (int i = 0; i < x.length; i++)
			{
				System.out.print(x[i]);
			}
			System.out.println();
		}
	}
}