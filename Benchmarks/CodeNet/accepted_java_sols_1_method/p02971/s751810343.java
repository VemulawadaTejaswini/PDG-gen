import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int max = -1;
		int second = -1;
		
		for (int i = 0; i < N; i++) {
			final int a = A[i];
			if (a > max) {
				second = max;
				max = a;
			} else if (a > second) {
				second = a;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (A[i] == max) {
				System.out.println(second);
			} else {
				System.out.println(max);
			}
		}
	}
}