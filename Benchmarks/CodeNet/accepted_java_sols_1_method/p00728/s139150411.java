import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n;
		while ((n = sc.nextInt()) != 0)
		{
			int ans = 0;
			int mi = 10000;
			int ma = 0;
			int in;
			for (int i = 0; i < n; i++)
			{
				in = sc.nextInt();
				ans += in;
				mi = Math.min(mi, in);
				ma = Math.max(ma, in);
			}
			System.out.println((int)((double)(ans - mi - ma) / (n - 2)));
		}
		sc.close();
	}
}
