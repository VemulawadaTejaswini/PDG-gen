import java.util.Scanner;

public class Main
{

	public static void main(String args[])
	{

		int temp = 0;

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		for(int i = 0; i < x; i++)
		{
			temp += 2;

			if((i + 1) == x)
			{
				if(temp == y)
				{
					System.out.println("Yes");
				}else
				{

					for(int j = i; j >= 0; j--)
					{
						temp -=2;
						temp +=4;

						if(temp == y)
						{
							System.out.println("Yes");
							break;
						}

						if(j == 0)
						{
							System.out.println("No");
						}

					}
				}
			}

		}

	}

}
