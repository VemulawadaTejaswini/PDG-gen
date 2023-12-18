import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		boolean not[] = new boolean[1000000];
		
		not[0] = false;
		not[1] = false;
		
		while(true)
		{
			try
			{
				int count = 0;
				int n = sc.nextInt();
				LOOP1 : for (int i = 2; i <= n; i++)
				{
					if (not[i]) continue LOOP1;
					for (int j = 2; j * j <= i ; j++)
					{
						if (i % j == 0)
						{
							continue LOOP1;
						}
					}
					for (int j = 2; i * j < n; j++)
					{
						not[i * j] = false;;
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