import java.util.Scanner;

public class Main {
	static public void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong();
		long b = scan.nextLong();
		scan.nextLong(); // c
		long k = scan.nextLong();
		scan.close();

		if (Math.abs(a - b) > Math.pow(10, 18)) {
			System.out.println("Unfair");
		} else {
			if (k % 2 == 0) {
				System.out.println(a - b);
			} else {
				System.out.println(b - a);
			}
		}
	}
}
