import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
		{
			int b = 0;
			int c = 0;
			for (int j = 0; j < 10; j++)
			{
				int ball = sc.nextInt();
				if (ball < b && ball < c)
				{
					System.out.println("NO");
					break;
				}
				
				if (b < ball && c <= b)
				{
					b = ball;
				}
				else if (c < ball)
				{
					c = ball;
				}
				if (j == 9)
				{
					System.out.println("YES");
				}
			}
		}
	}
}