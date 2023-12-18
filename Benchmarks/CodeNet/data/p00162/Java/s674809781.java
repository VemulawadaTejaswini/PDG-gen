import java.util.Scanner;
import java.util.HashSet;
class Main
{
	private static int m, n;
	private static HashSet<Integer> sets;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			m = sc.nextInt();
			if (m == 0) break;
			n = sc.nextInt();
			sets = new HashSet<Integer>();
			hammingCount(1);
			System.out.println(sets.size());
		}
	}
	private static void hammingCount(int x)
	{
		if (m <= x && x <= n)
		{
			sets.add(x);
		}
		else if (n < x)
		{
			return;
		}
		hammingCount(x * 2);
		hammingCount(x * 3);
		hammingCount(x * 5);
	}
}