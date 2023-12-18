import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static int Count(int x) {
		int y = 0;
		float z = (float)x;
		while (z >= 1.0) {
			y++;
			z = z/10;
		}
		return y;

	}

	public static void main(String[] args) {
		while (true) {
			Scanner scan = new Scanner(System.in);
			try {
				if (scan.hasNext() != true)
					return;
				int a = scan.nextInt();
				int b = scan.nextInt();
				int x = Count(a + b);
				System.out.println(x);
			} catch (InputMismatchException e) {
				return;
			}
		}
	}

}