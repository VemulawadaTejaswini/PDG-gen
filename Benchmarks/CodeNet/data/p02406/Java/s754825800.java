import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int x;

		for (; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
				continue;
			}

			x = i;

			while ((x % 10) == 3) {
				System.out.print(" " + i);
				break;
			}
			x = x / 10;
		}
		System.out.println("");
	}
}