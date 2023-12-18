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
		
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = n; i > 3; i--)
			{
				if (!(not[i] || not[i - 2]))
				{
					System.out.printf("%d %d\n", i-2, i);
					break;
				}
			}
		}
	}
}