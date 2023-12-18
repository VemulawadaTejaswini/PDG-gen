import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		System.out.println(x * y + " " + (2 * x + 2 * y));
	}
}