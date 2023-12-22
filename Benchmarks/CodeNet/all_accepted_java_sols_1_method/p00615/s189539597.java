import java.util.Scanner;
import java.util.Arrays;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt(),
				m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int times[] = new int[n+m];
			for (int i = 0; i < n + m; i++)
			{
				times[i] = sc.nextInt();
			}
			Arrays.sort(times);
			int max = times[0];
			for (int i = 1; i < n + m; i++)
			{
				max = Math.max(max, times[i] - times[i-1]);
			}
			System.out.println(max);
		}
	}
}