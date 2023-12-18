import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];

		int index = 0;
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if (h[i] != 0) {
				index = i;
			}
		}

		int ch = 0;

		for (int cx = 0; cx <= 100; cx++) {
			loop: for (int cy = 0; cy <= 100; cy++) {

				for (int i = 0; i < n; i++) {
					if (h[i] != 0) {
						index = i;
					}
				}
				ch = h[index] + Math.abs(cx - x[index]) + Math.abs(cy - y[index]);
				for (int i = 0; i < n; i++) {

					if (h[i] != Math.max(ch - Math.abs(cx - x[i]) - Math.abs(cy - y[i]), 0)) {
						continue loop;
					}
				}
				System.out.println(cx + " " + cy + " " + ch);
				System.exit(0);
			}
		}

		sc.close();
	}

}