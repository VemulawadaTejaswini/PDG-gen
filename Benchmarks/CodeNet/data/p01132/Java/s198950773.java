import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] purse = new int[4];
			for (int i = 0; i < 4; i++) {
				purse[i] = sc.nextInt();
			}
			Parse(n, purse);
		}
		sc.close();
	}

	private static void Parse(int n, int p[]) {
		int before = n;
		int after = 0;
		int[] coin = { 10, 50, 100, 500 };
		int[] count = new int[4];
		for (int i = 0; i < 4; i++) {
			after += coin[i] * p[i];
		}
		int s = after - before;
		// System.out.println(s);
		for (int i = 0; i < 4; i++) {
			// if (s / coin[3 - i] <= p[3 - i]) {
			count[3 - i] = s / coin[3 - i];
			s -= coin[3 - i] * count[3 - i];
			// } else {
			// count[3 - i] = (s / coin[3 - i]) - 1;
			// s -= coin[3 - i] * count[3 - i] - 1;
			// }
		}
		for (int x = 0; x < 4; x++) {
			count[x] = p[x] - count[x];
			if (count[x] > 0)
				System.out.println(coin[x] + " " + count[x]);
		}

	}
}