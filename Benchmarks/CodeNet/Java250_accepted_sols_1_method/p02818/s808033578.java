import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long tCookie = scan.nextLong();
		long aCookie = scan.nextLong();
		long count = scan.nextLong();
		scan.close();

		if (count <= tCookie) {
			tCookie -= count;
			System.out.println(tCookie + " " + aCookie);
			return;
		}

		if (tCookie + aCookie <= count) {
			System.out.println("0 0");
			return;
		}

		count -= tCookie;
		System.out.println("0 " + (aCookie - count));
	}
}
