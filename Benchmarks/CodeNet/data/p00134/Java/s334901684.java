import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long total = 0;
		for (long i = 0; i < n; i++)
		{
			total += sc.nextInt();
		}
		System.out.println(total / n);
	}
}