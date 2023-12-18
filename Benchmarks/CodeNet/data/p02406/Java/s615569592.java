import java.util.Scanner;

public class Main {
	private static Scanner sc;
	private static int n;
	private static int i;
	private static int x;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		n = sc.nextInt();
		i = 1;
		checkNum();
		System.out.println();
	}

	private static void checkNum() {
		x = i;
		if (x % 3 == 0) {
			System.out.print(" " + i);
			endCheckNum();
			return;
		}
		include3();
	}

	private static void include3() {
		if (x % 10 == 3) {
			System.out.print(" " + i);
			endCheckNum();
			return;
		}
		x /= 10;
		if (0 < x) {
			include3();
			return;
		}
		endCheckNum();
	}

	private static void endCheckNum() {
		if (++i <= n) {
			checkNum();
		}
	}
}