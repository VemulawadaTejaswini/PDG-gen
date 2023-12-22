import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int Y = sc.nextInt();
		Y = Y / 1000;
		int tmp = Y - n;
		int x = 0;
		int y = 0;
		int z = 0;
		int sum = 0;
		for (int t = 0; t <= tmp / 9; t++) {
			x = t;
			y = (tmp - 9 * x) / 4;
			sum = 9 * x + 4 * y;
			if (sum == tmp) {
				z = n - x - y;
				if (z >= 0) {
					System.out.println(x + " " + y + " " + z);
					return;
				}

			}
		}
		System.out.println("-1 -1 -1");

	}
}
