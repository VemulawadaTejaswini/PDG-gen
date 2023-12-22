
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		int ct = 0;
		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > 0; j--) {
				if (A[j] < A[j - 1]) {
					int k = A[j];
					A[j] = A[j - 1];
					A[j - 1] = k;
					ct++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(A[i]);
			if (i < N - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println(ct);
	}
}

