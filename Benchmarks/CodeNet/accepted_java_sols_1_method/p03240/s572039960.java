import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		int[] h = new int[N];
		int hi = 0;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
			if (h[i] != 0) {
				hi = i;
			}
		}
		int height;
		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				height = h[hi] + Math.abs(x[hi] - i) + Math.abs(y[hi] - j);
				for (int k = 0; k < N; k++) {
					if (h[k] != Math.max(height - Math.abs(x[k] - i) - Math.abs(y[k] - j), 0)) {
						break;
					}
					if (k == N - 1) {
						System.out.println(i + " " + j + " " + height);
						sc.close();
						return;
					}
				}
			}
		}

		sc.close();
	}

}
