import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (true)
		{
			try
			{
				int a[] = new int[4];
				for (int i = 0; i < 4; i++)
				{
					a[i] = sc.nextInt();
				}
				
				int hit = 0;
				int blow = 0;
				for (int i = 0; i < 4; i++)
				{
					int b = sc.nextInt();
					if (a[i] == b) hit++;
					else
					{
						for (int j = 0; j < 4; j++)
						{
							if (a[j] == b) blow++;
						}
					}
				}
				System.out.println(Integer.toString(hit) + " " + Integer.toString(blow));
			}
			catch (Exception e)
			{
				break;
			}
		}
	}
}