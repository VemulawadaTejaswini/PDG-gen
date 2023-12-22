import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	StringBuilder out;

	void run() {
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}

		int cnt = 0;
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (A[j] > A[j + 1]) {
					int tmp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = tmp;
					cnt++;
				}
			}
		}
		for (int i = 0; i < A.length; i++) {
			System.out.print((i == 0 ? "" : " ") + A[i]);
		}
		System.out.println("\n" + cnt);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}