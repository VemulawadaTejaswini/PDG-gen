import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int[] x = new int[n];
			int[] y = new int[n];

			int minValue1 = Integer.MAX_VALUE;
			int maxValue1 = Integer.MIN_VALUE;
			int minValue2 = Integer.MAX_VALUE;
			int maxValue2 = Integer.MIN_VALUE;

			for (int i = 0; i < n; i++) {
				int a = x[i] = sc.nextInt();
				int b = y[i] = sc.nextInt();

				int u = a + b;
				if (u < minValue1) {
					minValue1 = u;
				}
				if (maxValue1 < u) {
					maxValue1 = u;
				}

				int v = a - b;
				if (v < minValue2) {
					minValue2 = v;
				}
				if (maxValue2 < v) {
					maxValue2 = v;
				}
			}

			System.out.println(Math.max(maxValue1-minValue1, maxValue2-minValue2));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}