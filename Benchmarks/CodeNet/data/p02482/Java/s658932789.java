import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		if (x > y) System.out.println("a > b");
		else if (x < y) System.out.println("a < b");
		else System.out.println("a == b");
	}
}