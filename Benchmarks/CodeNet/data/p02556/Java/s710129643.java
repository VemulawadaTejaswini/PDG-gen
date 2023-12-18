import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();

			int[] x = new int[n];
			int[] y = new int[n];

			int minValue1 = Integer.MAX_VALUE;
			int minIndex1 = -1;
			int maxValue1 = Integer.MIN_VALUE;
			int maxIndex1 = -1;
			int minValue2 = Integer.MAX_VALUE;
			int minIndex2 = -1;
			int maxValue2 = Integer.MIN_VALUE;
			int maxIndex2 = -1;

			for (int i = 0; i < n; i++) {
				int a = x[i] = sc.nextInt();
				int b = y[i] = sc.nextInt();

				int u = a + b;
				if (u < minValue1) {
					minValue1 = u;
					minIndex1 = i;
				}
				if (maxValue1 < u) {
					maxValue1 = u;
					maxIndex1 = i;
				}

				int v = a - b;
				if (v < minValue2) {
					minValue2 = u;
					minIndex2 = i;
				}
				if (maxValue2 < v) {
					maxValue2 = u;
					maxIndex2 = i;
				}
			}

			int result1 = Math.abs(x[minIndex1] - x[maxIndex1]) + Math.abs(y[minIndex1] - y[maxIndex1]);
			int result2 = Math.abs(x[minIndex2] - x[maxIndex2]) + Math.abs(y[minIndex2] - y[maxIndex2]);
			System.out.println(Math.max(result1, result2));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}