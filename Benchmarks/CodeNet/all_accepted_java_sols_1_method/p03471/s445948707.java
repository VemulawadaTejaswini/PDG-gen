import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int Y = s.nextInt();


		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= N - i; j++) {
				for (int k = 0; k <= N - i - j; k++) {
					if (i + j + k == N) {
						if (i * 1000 + j * 5000 + k * 10000 == Y) {
							System.out.println(k + " " + j + " " + i);
							return;
						}
					}
				}
			}
		}
		System.out.println("-1 -1 -1");

	}
}
