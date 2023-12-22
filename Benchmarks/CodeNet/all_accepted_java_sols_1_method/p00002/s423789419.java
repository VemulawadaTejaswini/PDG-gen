import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b;

		Scanner scan = new Scanner(System.in);

		while ((scan.hasNext())) {

			a = Integer.parseInt(scan.next());
			b = Integer.parseInt(scan.next());

			String length = String.valueOf(a + b);

			System.out.println(length.length());

		}
	}
}