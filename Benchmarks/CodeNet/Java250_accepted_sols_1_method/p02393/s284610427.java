import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int a[] = new int[3];
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextInt();

		for (int i = a.length - 1; i > 0; i--)
		{
			for (int j = i - 1; j >= 0; j--)
			{
				if (a[j] > a[i])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
System.out.println(a[0] + " " + a[1] + " " + a[2]);

	}

}