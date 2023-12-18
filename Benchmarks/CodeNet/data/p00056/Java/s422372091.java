import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[100000];
		not[0] = true;
		not[1] = true;
		int pCount = 2;
		for (int i = 2; i * i < 100000; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 100000; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
				pCount++;
			}
		}
		int primes[] = new int[100000 - pCount];
		int index = 0;
		for (int i = 0; i < 100000; i++)
		{
			if (!not[i])
			{
				primes[index] = i;
				index++;
			}
		}
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0)
		{
			if (n != 5 && !not[n])
			{
				System.out.println(0);
				continue;
			}
			int count = 0;
			for (int i = 0; primes[i] < n; i++)
			{
				for (int j = i; primes[j] < n; j++)
				{
					if (primes[i] + primes[j] == n)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}