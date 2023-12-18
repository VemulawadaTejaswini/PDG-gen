import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char map[] = new char[256];
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			for (int i = 0; i < 256; i++)
			{
				map[i] = (char) i;
			}
			for (int i = 0; i < n; i++)
			{
				map[(int)sc.next().charAt(0)] = sc.next().charAt(0);
			}
			int m = sc.nextInt();
			for (int i = 0; i < m; i++)
			{
				System.out.print(map[sc.next().charAt(0)]);
			}
			System.out.println();
		}
	}
}