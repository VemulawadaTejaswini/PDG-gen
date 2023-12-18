import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int bord[] = new int[n];
			for (int i = 0; i < n; i++)
			{
				bord[i] = sc.nextInt();
			}
			int move[] = new int[m];
			for (int i = 0; i < m; i++)
			{
				move[i] = sc.nextInt();
			}
			int pos = 0;
			int i;
			for (i = 0; i < m; i++)
			{
				pos += move[i];
				if (pos + 1 >= n) break;
				pos += bord[pos];
				if (pos + 1 >= n) break;
			}
			System.out.println(i+1);
		}
	}
}