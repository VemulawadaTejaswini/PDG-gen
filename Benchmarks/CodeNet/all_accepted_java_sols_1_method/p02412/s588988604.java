

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int N = sc.nextInt();
			int X = sc.nextInt();

			if (N == 0 && X == 0) {
				break;
			}

			int sum = 0;

			for (int i=1; i<=N; i++) {
				for (int j=i+1; j<=N; j++) {
					for (int k=j+1; k<=N; k++) {
						if (i + j + k == X) {
							sum++;
						}
					}
				}
			}
				System.out.println(sum);
		}
	}
}
