import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		for (int x = 1; x < 10; x++)
			for (int y = 1; y < 10; y++)
				System.out.println(x + "x" + y + "=" + x * y);
		System.exit(0);
	}
}