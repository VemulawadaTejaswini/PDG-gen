import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num[] = new int[100];
		for (int i = 0; i < 100; i++)
		{
			try
			{
				num[sc.nextInt()]++;
			}
			catch (Exception e)
			{
				break;
			}
		}
		int max = 0;
		for (int i = 0; i < 100; i++)
		{
			max = Math.max(max, num[i]);
		}
		for (int i = 0; i < 100; i++)
		{
			if (max == num[i])
				System.out.println(i);
		}
	}
}