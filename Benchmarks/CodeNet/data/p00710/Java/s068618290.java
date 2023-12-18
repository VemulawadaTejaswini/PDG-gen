import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0)
				break;
			int[] cards = new int[n];
			for (int i = 0; i < n; i++)
				cards[i] = n - i;
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				int old[] = new int[p + c - 1];
				for (int j = 0; j < p + c - 1; j++)
					old[j] = cards[j];
				for (int j = 0; j < c; j++)
					cards[j] = old[j + p - 1];
				for (int j = 0; j < p - 1; j++)
					cards[j + c] = old[j];
			}
			System.out.println(cards[0]);
		}
	}
}