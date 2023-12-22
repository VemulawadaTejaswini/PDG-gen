import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int A = s.nextInt();
		int B = s.nextInt();
		int K = s.nextInt();
		int check = 0;

		if ((B - A + 1) / 2 < K) {
			for (int i = A; i <= B; i++) {
				System.out.println(i);
			}
		} else {
			for (int i = A; i < A + K; i++) {
				System.out.println(i);
				check = i;
			}

			for (int j = B - K + 1; j <= B; j++) {
				if (check < j) {
					System.out.println(j);
				}
			}
		}
	}
}
