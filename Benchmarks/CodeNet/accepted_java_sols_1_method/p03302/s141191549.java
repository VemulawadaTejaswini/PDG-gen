import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			int n = Integer.parseInt(sc.next());
			int m = Integer.parseInt(sc.next());

			if (n + m == 15) {
				System.out.println("+");
			} else if (n * m == 15) {
				System.out.println("*");
			} else {
				System.out.println("x");
			}

		}
	}
}
