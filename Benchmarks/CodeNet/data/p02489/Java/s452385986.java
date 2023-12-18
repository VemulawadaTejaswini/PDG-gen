import java.util.Scanner;
//100006

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int x;
		int i = 0;

		while (true) {
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.println("Case " + (i + 1) + ": " + x);
			i++;
		}

		// while (j < i) {
		// // System.out.printf("Case %d: %d\n", j + 1, num[j]);
		// System.out.println("Case " + (j + 1) + ": " + num[j]);
		//
		// j++;
		// }
	}
}