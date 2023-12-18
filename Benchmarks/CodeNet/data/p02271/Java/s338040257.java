import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static int A[] = new int[20];
	public static boolean rec(int s, int n, int now)
	{
		if(n == -1)
		{
			if(now == s)
			{
				return true;
			}
			return false;
		}
		return rec(s, n - 1, now + A[n]) | rec(s, n - 1, now);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, q, m[] = new int[200];
		n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
			A[i] = sc.nextInt();
		}
		q = sc.nextInt();
		for(int i = 0; i < q; i++)
		{
			m[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++)
		{
			if(rec(m[i], n - 1, 0))
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
		}
		sc.close();
	}
}
