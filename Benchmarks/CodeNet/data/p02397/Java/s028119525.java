import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt(), y = scanner.nextInt(), swap;

		if (x > y) {
			swap = x;
			x = y;
			y = swap;
		}
		System.out.println(x + " " + y);
	}
}