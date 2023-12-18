import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] ary = new int[N];

		for (int i = 0; i < N; i++)
		{
			ary[i] = sc.nextInt();
		}

		boolean flag = true;
		int numSwap = 0;
		while (flag)
		{
			flag = false;

			for (int i = N - 1; i >= 1; i--)
			{
				if (ary[i] < ary[i - 1])
				{
					int temp = ary[i];
					ary[i] = ary[i - 1];
					ary[i - 1] = temp;

					numSwap++;
					flag = true;
				}
			}
		}

		for (int i = 0; i < N; i++)
		{
			System.out.print(ary[i]);
			if (i < N - 1)
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
		System.out.println(numSwap);
	}
}

