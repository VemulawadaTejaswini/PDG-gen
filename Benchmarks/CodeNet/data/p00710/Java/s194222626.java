import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			int n, r;
			while ((n = sc.nextInt()) != 0 && (r = sc.nextInt()) != 0) {
				int[] yama = new int[n];
				for (int i = 0; i < n; i++) {
					yama[i] = n - i;
				}

				for (int j = 0; j < r; j++) {
					int p = sc.nextInt();
					int c = sc.nextInt();
					int[] pyama = new int[p - 1];
					int[] cyama = new int[c];

					for (int i = 0; i < p - 1; i++) {
						pyama[i] = yama[i];
					}
					for (int i = 0; i < c; i++) {
						cyama[i] = yama[i + p - 1];
					}

					for (int i = 0; i < c; i++) {
						yama[i] = cyama[i];
					}
					for (int i = 0; i < p - 1; i++) {
						yama[i + c] = pyama[i];
					}
				}

				System.out.println(yama[0]);
			}
		}
	}
}