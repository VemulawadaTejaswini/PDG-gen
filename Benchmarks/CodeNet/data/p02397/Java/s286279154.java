
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			Integer x = sc.nextInt();
			Integer y = sc.nextInt();

			if (x == 0 && y == 0) {
				return;
			}

			if (x > y) {
				System.out.println(y + " " + x);
			} else {
				System.out.println(x + " " + y);
			}

		}

	}

}

