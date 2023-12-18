import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int data = sc.nextInt();
		for (int i = 1; ; i++)
		{
			if (data == 0)
			{
				break;
			}

			System.out.println("Case " + i + ": " + data);
		}
	}
}

