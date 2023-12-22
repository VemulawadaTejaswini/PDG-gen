import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		long y = in.nextLong();
		if (Math.abs(x) == Math.abs(y)) {
			System.out.println(1);
		} else if (x < y) {
			if ((Math.signum(x) == Math.signum(y)) || (x == 0 || y == 0)) {
				System.out.println(y - x);
			} else {
				System.out.println(Math.abs(x + y) + 1);
			}
		} else if (Math.signum(x) == Math.signum(y)) {
			System.out.println(Math.abs(y - x) + 2);
		} else {
			System.out.println(Math.abs(y + x) + 1);
		}
		in.close();
	}
}