import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[100000];
		not[0] = true;
		not[1] = true;
		for (int i = 2; i * i < 100000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 100000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			int n = sc.nextInt(),
				p = 0;
			for (int i = 2; i < n; i++)
			{
				if (!not[i] && !not[n - (i - 1)])
					p++;
			}
			System.out.println(p);
		}
	}
}