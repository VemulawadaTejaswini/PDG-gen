
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(findGCD(x, y));
	}

	/**
	 * finds the GCD of x and y
	 */
	public static int findGCD(int x, int y) {
		if (y == 0) {
			return x;
		} else {
			return findGCD(y, x % y);
		}
	}

}

