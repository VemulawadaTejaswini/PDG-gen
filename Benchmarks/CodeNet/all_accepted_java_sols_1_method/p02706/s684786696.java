import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int A[] = new int[M];

		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			N -= A[i];
		}
		if (N >= 0) {
			System.out.println(N);
		} else {
			System.out.println(-1);
		}
	}
}
