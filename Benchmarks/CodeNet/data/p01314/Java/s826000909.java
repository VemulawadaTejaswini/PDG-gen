

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[1000];


			for (int i = 0; i < 1000; i++) {
				num[i] = i + 1;
			}

			for (;;) {

			int n = sc.nextInt();
			int count = 0;

			if (n==0) {
				break;
			}

			for (int i = 0; i < 1000; i++) {
				int sum = num[i];
				for (int j = 1; sum <= n; j++) {
					sum += num[i + j];
					if (sum == n) {
						count++;
						break;
					}
				}
			}
			System.out.println(count);
		}
	}
}

