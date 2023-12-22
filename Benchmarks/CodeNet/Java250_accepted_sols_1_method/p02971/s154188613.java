import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer A[] = new Integer[N];
		Integer B[] = new Integer[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] > max) {
				max = A[i];
			}
		}
		sc.close();

		for (int i = 0; i < N; i++) {
			B[i] = A[i];
		}
		Arrays.sort(B, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			if (A[i] == max) {
				System.out.println(B[1]);
			} else {
				System.out.println(max);
			}
		}
	}
}
