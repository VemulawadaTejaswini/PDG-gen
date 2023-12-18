
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			if (n == 0 && r == 0) break;
			int[] card = new int[n];
			for (int i = 0; i < n; i++) {
				card[i] = n - i;
			}
			for (int i = 0; i < r; i++) {
				int p = sc.nextInt();
				int c = sc.nextInt();
				for (int j = 0; j < c; j++) {
					for (int k = p + c - 2; k > 0; k--) {
						int l = card[k];
						card[k] = card[k - 1];
						card[k - 1] = l;
					}
				}
			}
			System.out.println(card[0]);
		}
	}
}

