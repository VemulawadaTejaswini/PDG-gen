import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		System.out.println((a * b) + " " + ((a + b) * 2));
	}
}