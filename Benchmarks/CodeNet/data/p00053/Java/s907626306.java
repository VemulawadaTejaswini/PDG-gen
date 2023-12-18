import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		boolean not[] = new boolean[10240];
		not[0] = true;
		not[1] = true;
		for (int i = 2; i * i < 10240; i++)
		{
			if (not[i]) continue;
			for (int x = (i << 1); x < 10240; x += i)
			{
				if (not[x]) continue;
				not[x] = true;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0)
		{
			int sum = 0;
			int count = 0;
			for (int i = 0; i < 10240; i++)
			{
				if (!not[i])
				{
					sum += i;
					count++;
					if (count == n)
					{
						break;
					}
				}
			}
			System.out.println(sum);
		}
	}
}