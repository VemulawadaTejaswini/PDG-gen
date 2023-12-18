import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int b = 0;
		int c = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < 10; j++)
			{
				int ball = sc.nextInt();
			
				if (c < ball && ball < b)
				{
					c = ball;
				}
				else if (b < ball)
				{
					b = ball;
				}
				else
				{
					System.out.println("NO");
					break;
				}
				if (j == 9)
				{
					System.out.println("YES");
				}
			}
		}
	}
}