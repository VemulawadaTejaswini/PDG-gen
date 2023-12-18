import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), total = 0;
		for (int i = 0; i < n; i++)
		{
			total += sc.nextInt();
		}
		System.out.println((int) total / n);
	}
}