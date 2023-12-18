import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int minCost = 40_000 * n;
		for (int i = -100; i <= 100; i++) {
			int sumCost = 0;
			for (int j = 0; j < n; j++) {
				int sub = a[j] - i;
				sumCost += sub * sub;
			}

			if (sumCost < minCost) {
				minCost = sumCost;
			}
		}

		System.out.println(minCost);

		sc.close();
	}

}
