import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();

		sc.close();
		long c = (long)(a * b);
		System.out.println(c);
	}
}