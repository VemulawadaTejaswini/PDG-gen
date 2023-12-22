import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNextInt())
		{
			int n = sc.nextInt();
			int a = 1;
			for (int i = 0; i < n; i++)
			{
				a += 1 + i;
			}
			System.out.println(a);
		}
	}
}