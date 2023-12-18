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
			if (n == 0 && m == 0)
				break;
			
			int taro[] = new int[n];
			int taroTotal = 0;
			for (int i = 0; i < n; i++)
			{
				taro[i] = sc.nextInt();
				taroTotal += taro[i];
			}
			int hanako[] = new int[m];
			int hanakoTotal = 0;
			for (int i = 0; i < m; i++)
			{
				hanako[i] = sc.nextInt();
				hanakoTotal += hanako[i];
			}
			LOOP: {
				for (int i = 0; i < n; i++)
				{
					for (int j = 0; j < m; j++)
					{
						if (taroTotal - taro[i] + hanako[j] == hanakoTotal - hanako[j] + taro[i])
						{
							System.out.printf("%d %d\n", taro[i], hanako[j]);
							break LOOP;
						}
					}
				}
				System.out.println(-1);
			}
		}
	}
}