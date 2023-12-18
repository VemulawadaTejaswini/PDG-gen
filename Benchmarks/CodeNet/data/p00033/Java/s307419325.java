import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int b = 0;
		int c = 0;
		int count = 0;
		
		sc.nextLine();
		for (int i = 0; i < n; i++)
		{
			String strs[] = sc.nextLine().split(" ");
			int balls[] = new int[strs.length];
			for (int j = 0; j < balls.length; j++)
			{
				balls[j] = Integer.parseInt(strs[j]);
			}
			
			LOOP:
			{
				for (int j = 0; j < balls.length; j++)
				{
					int ball = balls[j];
					if (b < c)
					{
						if (b < ball && ball < c) b = ball;
						else if (c < ball) c = ball;
						else
						{
							System.out.println("NO");
							break LOOP;
						}
					}
					else
					{
						if (c < ball && ball < b) c = ball;
						else if (b < ball) b = ball;
						else
						{
							System.out.println("NO");
							break LOOP;
						}
					}
				}
				System.out.println("YES");
			}
		}
	}
}