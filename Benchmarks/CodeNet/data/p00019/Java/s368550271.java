import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(fact(sc.nextInt()));
	}
	private static long fact(long n)
	{
		if (n == 1) return 1;
		return fact(n - 1) * n;
	}
}