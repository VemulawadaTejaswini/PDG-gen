import java.util.Scanner;

public class Main
{

	public static void main(String args[])
	{

		int[] x = new int[5];

		Scanner sc = new Scanner(System.in);

		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x[4] = sc.nextInt();

		sc.close();

		for(int i = 0; i < 5; i++)
		{
			if(x[i] != (i + 1))
			{
				System.out.println(i + 1);
			}
		}
	}

}