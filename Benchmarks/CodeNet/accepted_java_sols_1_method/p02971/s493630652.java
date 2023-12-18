import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		int B[] = new int[N];
		int maxFirst, maxSecond;

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			B[i] = A[i];
		}

		Arrays.sort(A);
		maxFirst = A[N - 1];
		maxSecond = A[N - 2];

		for (int i = 0; i < N; i ++) {
			if (B[i] != maxFirst) {
				System.out.println(maxFirst);
			} else {
				System.out.println(maxSecond);
			}
		}
	}
}
