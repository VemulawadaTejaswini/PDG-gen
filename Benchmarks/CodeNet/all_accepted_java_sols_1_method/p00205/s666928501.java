import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int hands[] = new int[5];
			boolean orverall[] = new boolean[3];
			hands[0] = sc.nextInt();
			if (hands[0] == 0) break;
			orverall[hands[0]-1] = true;
			for (int i = 1; i < 5; i++)
			{
				hands[i] = sc.nextInt();
				orverall[hands[i]-1] = true;
			}
			for (int i = 0; i < 5; i++)
			{
				int win = (hands[i] % 3);
				int lose = ((hands[i] + 1) % 3);
				if (orverall[win])
				{
					if (orverall[lose])
					{
						System.out.println(3);
					}
					else
					{
						System.out.println(1);
					}
				}
				else
				{
					if (orverall[lose])
					{
						System.out.println(2);
					}
					else
					{
						System.out.println(3);
					}
				}
			}
		}
	}
}