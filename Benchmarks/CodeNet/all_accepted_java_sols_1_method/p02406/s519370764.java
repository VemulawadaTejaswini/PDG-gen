import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;

		do {
			int x = i;
			if (x % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}
			while (true) {
				if (x % 10 == 3) {
					System.out.print(" " + i);
					break;
				}
				x /= 10;
				if (x == 0) {
					break;
				}
			}

		} while (++i <= n);
		System.out.println();
	}

}