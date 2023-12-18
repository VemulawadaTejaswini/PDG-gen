import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n = sc.nextInt();
	static int[] x_n = new int[n];
	static int[] y_n = new int[n];
	public static void main(String[] args) {
		inputP();
		nearest();
	}

	private static void nearest() {
		long nearest = (long) (Math.pow(x_n[0] - x_n[1], 2) +
				Math.pow(y_n[0] - y_n[1], 2));

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				long d = (long) (Math.pow(x_n[i] - x_n[j], 2) +
						Math.pow(y_n[i] - y_n[j], 2));
					if (nearest > d) {
						nearest = d;
					}
			}
		}

		System.out.println(nearest);
	}

	private static void inputP() {
		for (int i = 0; i < n; i++) {
			x_n[i] = sc.nextInt();
			y_n[i] = sc.nextInt();
		}

	}

}

