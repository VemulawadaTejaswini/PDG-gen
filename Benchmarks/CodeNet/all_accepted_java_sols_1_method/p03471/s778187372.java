import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = sc.nextInt();

		int limitCount10000 = (y / 10000) + 1;
		int limitCount5000 = (y / 5000) + 1;
		int limitCount1000 = (y / 1000) + 1;

		for (int i = 0; i < limitCount1000; i++) {
			if (i > n) {
				break;
			}
			for (int j = 0; j < limitCount5000; j++) {
				if (i + j > n) {
					break;
				}
				int k = n - (i + j);
				if (i * 1000 + j * 5000 + k * 10000 == y) {
					System.out.println (k + " " + j + " " + i);
					return;
				}
			}
		}
		System.out.println(-1 + " " + -1 + " " + -1);
	}
}
