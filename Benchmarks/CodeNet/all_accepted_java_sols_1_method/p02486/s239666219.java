

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N, X;
		while (true) {
			int count = 0;
			N = scan.nextInt();
			X = scan.nextInt();
			if (N + X == 0) {
				break;
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 2; j <= N; j++) {
					if (i == j || i > j) {
						continue;
					}
					for (int k = 3; k <= N; k++) {
						if (j == k || i == k || j > k || i > k) {
							continue;
						}
						if (i + j + k == X) {
							count = count + 1;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

}