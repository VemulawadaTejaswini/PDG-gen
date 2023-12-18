

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int flag = 1;
		int count = 0;
		while (flag != 0) {
			for (int j = 0; j < n; j++) {
				if (a[j] % 2 == 0) {
					a[j] = a[j] / 2;
				} else {
					flag = 0;
				}
			}
			count ++;
		}

		System.out.println(count - 1);
	}
}
