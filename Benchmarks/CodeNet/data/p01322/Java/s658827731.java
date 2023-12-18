import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(),
				m = sc.nextInt();
			if (n == 0) break;
			String luckNum[] = new String[n];
			long value[] = new long[n];
			for (int i = 0; i < n; i++)
			{
				luckNum[i] = sc.next();
				value[i] = sc.nextInt();
			}
			long total = 0;
			for (int i = 0; i < m; i++)
			{
				String str = sc.next();
				for (int j = 0; j < n; j++)
				{
					NUMBERCHECK: {
						for (int k = 0; k < 8; k++)
						{
							char c = luckNum[j].charAt(k);
							if (c != '*' && str.charAt(k) != c)
								break NUMBERCHECK;
						}
						total += value[j];
					}
				}
			}
			System.out.println(total);
		}
	}
}