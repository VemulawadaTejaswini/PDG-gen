import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int x = i;
		int start = 0;

		while (i <= n) {
			if (start == 0) {
				x = i;
				if (x % 3 == 0) {
					System.out.print(" " + i);
					start = 2;
				}
			}
			if (start <= 1) {
				if (x % 10 == 3) {
					System.out.print(" " + i);
					start = 2;
				}
				if (start <= 1) {
					x /= 10;
					if (0 < x) {
						start = 1;
						continue;
					}
				}
			}
			i++;
			start = 0;
		}

		System.out.println();
	}
}