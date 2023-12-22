import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{
		int a;
			a = sc.nextInt();
		int b;
			b = sc.nextInt();
			
		int m = a * b;
		int l = a * 2 + b * 2;

		System.out.println(m + " " + l);
	}
}