import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int[] h = new int[100];
		int[] w = new int[100];

		int numData;
		for (int i = 0; ; i++)
		{
			int tempH = sc.nextInt();
			int tempW = sc.nextInt();

			if (tempH == 0 && tempW == 0)
			{
				numData = i;
				break;
			}

			h[i] = tempH;
			w[i] = tempW;
		}

		for (int i = 0; i < numData; i++)
		{
			for (int j = 0; j < h[i]; j++)
			{
				for (int k = 0; k < w[i]; k++)
				{
					if (j == 0 || j == h[i] - 1)
					{
						System.out.print("#");
					}
					else
					{
						if (k == 0 || k == w[i] - 1)
						{
							System.out.print("#");
						}
						else
						{
							System.out.print(".");
						}
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
