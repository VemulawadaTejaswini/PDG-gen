import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int w, n;
		w = sc.nextInt();
		n = sc.nextInt();
		int amida[] = new int[31];
		for (int i = 0; i <= 30; i++)
		{
			amida[i] = i;
		}
		String[] s;
		int a, b;
		int tmp;
		for (int i = 0; i < n; i++)
		{
			s = sc.next().split(",");
			a = Integer.valueOf(s[0]).intValue();
			b = Integer.valueOf(s[1]).intValue();
			tmp = amida[a];
			amida[a] = amida[b];
			amida[b] = tmp;
		}
		for (int i = 1; i <= w; i++)
		{
			System.out.println(amida[i]);
		}
		sc.close();
	}
}
