import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, p, q, r;
		while ((n = in.nextInt()) > 0) {
			m = in.nextInt();
			p = in.nextInt() - 1;
			q = in.nextInt() - 1;
			boolean[] cards = new boolean[n];
			Arrays.fill(cards, 0, in.nextInt(), true);
			boolean[] next = new boolean[n];
			for (int i = 0; i < m; i++) {
				int x = in.nextInt();
				int y = in.nextInt();
				System.arraycopy(cards, 0, next, n - x, x);
				System.arraycopy(cards, x, next, n - y, y - x);
				System.arraycopy(cards, y, next, 0, n - y);
				boolean[] c = cards;
				cards = next;
				next = c;
			}
			int count = 0;
			for (int i = p; i <= q; i++) {
				if (cards[i])
					count++;
			}
			System.out.println(count);
		}
	}
}