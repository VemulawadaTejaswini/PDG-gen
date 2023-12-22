import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int W, H;
		int x, y, r;

		Scanner stdIn = new Scanner(System.in);

		W = stdIn.nextInt();
		H = stdIn.nextInt();
		x = stdIn.nextInt();
		y = stdIn.nextInt();
		r = stdIn.nextInt();

		if (0 <= (y - r) && H >= (y + r) && 0 <= (x - r) && W >= (x + r)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}