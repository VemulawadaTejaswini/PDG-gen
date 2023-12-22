

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[];

		a = new int[3];
		int max = 0, min = 1000000;
		int tmp = 0, tmp2 = 0, tmp3 = 0;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; ++i) {
			a[i] = sc.nextInt();
			if (max < a[i]) {
				max = a[i];
				tmp = i;
			}
			if (min > a[i]) {
				min = a[i];
				tmp2 = i;
			} else {
				tmp3 = i;
			}
		}
		sc.close();
		for (int i = 0; i < 3; ++i) {
			if (tmp != i && tmp2 != i) {
				tmp3 = i;
			}
		}
		max *= 10;
		max += a[tmp3];
		max += min;
		System.out.println(max);
	}

}
