
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A[] = new int[N];

		int maxA = 0;
		int maxAIndex = -1;
		int maxA2 = 0;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();

			if (maxA <= A[i]) {
				maxA = A[i];
				maxAIndex = i;
			}
		}

		for (int i = 0; i < N; i++) {

			if (i == maxAIndex) {
				continue;
			}

			if (maxA2 <= A[i]) {
				maxA2 = A[i];
			}
		}

		for (int i = 0; i < N; i++) {

			if (!(i == maxAIndex)) {
				System.out.println(maxA);
			} else {
				System.out.println(maxA2);
			}
		}
	}
}