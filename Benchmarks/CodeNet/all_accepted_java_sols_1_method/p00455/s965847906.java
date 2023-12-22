import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++)
		{
			int h1 = sc.nextInt(),
				m1 = sc.nextInt(),
				s1 = sc.nextInt(),
				h2 = sc.nextInt(),
				m2 = sc.nextInt(),
				s2 = sc.nextInt();
			int h = h2 - h1,
				m = m2 - m1,
				s = s2 - s1;
			if (s < 0)
			{
				m--;
				s += 60;
			}
			if (m < 0)
			{
				h--;
				m += 60;
			}
			System.out.printf("%d %d %d\n", h, m, s);
		}
	}
}