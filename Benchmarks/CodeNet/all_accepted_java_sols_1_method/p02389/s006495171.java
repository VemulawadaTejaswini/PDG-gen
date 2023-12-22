import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		int a, b, menseki, mawari;

		Scanner scan = new Scanner(System.in);

		a = Integer.parseInt(scan.next());
		b = Integer.parseInt(scan.next());

		if ((a >= 1) && (b <= 100)) {

			menseki = a * b;
			mawari = 2 * (a + b);
			System.out.println(menseki + " " + mawari);
		}
	}
}