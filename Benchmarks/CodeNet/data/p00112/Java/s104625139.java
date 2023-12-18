import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();
			if (n == 0) break;
			int all = 0, total = 0;
			int m[] = new int[n - 1];
			for (int i = 0; i < m.length; i++)
			{
				m[i] = sc.nextInt();
			}
			Arrays.sort(m);
			for (int i = 0; i < m.length; i++)
			{
				total += m[i];
				all += total;
			}
			System.out.println(all);
		}
	}
}