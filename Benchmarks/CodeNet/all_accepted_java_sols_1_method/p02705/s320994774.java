import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		double pai2=6.28318530717958623200;

		Scanner sc = new Scanner(System.in);
		long r = (long)sc.nextInt();
		sc.close();
		System.out.println(r*pai2);
	}
}
