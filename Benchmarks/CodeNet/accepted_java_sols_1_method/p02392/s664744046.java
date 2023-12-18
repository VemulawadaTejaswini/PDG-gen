import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a, b, c;

		Scanner scan = new Scanner(System.in);

		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());
		c = Integer.parseInt(scan.next());

		if ((a < b) && (b < c)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}