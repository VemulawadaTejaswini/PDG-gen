import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int r = scan.nextInt();
		int D = scan.nextInt();
		int x = scan.nextInt();

		for(int i = 0; i < 10; i++)
		{
			// x = x r -D
			x = x * r - D;
			System.out.println(x);
		}

	}
}