import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		int a[];
		int sum, sum2;
		int max;
		int space;

		n = sc.nextInt();
		k = sc.nextInt();
		while (n + k != 0) {
			a = new int[n + 1];
			sum   = 0;
			sum2  = 0;
			max   = 0;
			space = 0;

			for (int i = 0; i < k; i++) {
				a[sc.nextInt()] = 1;
			}

			if (a[0] == 0) {
				for (int i = 1; i <= n; i++) {
					if (a[i] == 1) {
						sum++;
					} else {
						max = (max < sum) ? sum : max;
						sum = 0;
					}
				}
				max = (max < sum) ? sum : max;
			} else {
				for (int i = 1; i <= n; i++) {
					if (a[i] == 1) {
						sum2++;
					} else {
						if (space == 1) {
							max = (max < sum + sum2 + 1) ? sum + sum2 + 1 : max;
							sum = sum2;
							sum2 = 0;
							space = 0;
						}
						max = (max < sum2) ? sum2 : max;
						space++;
					}
				}
				if (space == 1) {
					max = (max < sum + sum2 + 1) ? sum + sum2 + 1 : max;
				}
				max = (max < sum2) ? sum2 : max;
			}
			System.out.println(max);
			n = sc.nextInt();
			k = sc.nextInt();
		}
	}
}