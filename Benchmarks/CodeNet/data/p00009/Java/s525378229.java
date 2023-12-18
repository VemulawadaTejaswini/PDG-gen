import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			try
			{
				int count = 0;
				int n = sc.nextInt();
				LOOP1 : for (int i = 2; i <= n; i++)
				{
					for (int j = 2; j * j <= i ; j++)
					{
						if (i % j == 0)
						{
							continue LOOP1;
						}
					}
					count++;
				}
				System.out.println(Integer.toString(count));
			}
			catch(Exception e)
			{
				break;
			}
		}
	}
}