import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt(), a = s.nextInt(), b = s.nextInt(), c = s
					.nextInt(), x = s.nextInt();
			if (n < 1) {
				break;
			}

			int rs[] = new int[n];
			for (int i = 0; i < n; ++i) {
				rs[i] = s.nextInt();
			}

			int count = 0;
			l: for (int r : rs) {
				while ( x != r) {
					x = (a * x + b) % c;
					if (++count > 10000) {
						count = -1;
						break l;
					}
					if (x == r) {
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}