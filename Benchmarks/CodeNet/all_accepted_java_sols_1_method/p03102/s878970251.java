import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int A[] = new int[M];
		int cnt = 0;

		int[] B = new int[M];
		for (int i = 0; i < M; i++) {
			B[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int det = 0;
			for (int j = 0; j < M; j++) {
				det += B[j] * sc.nextInt();
			}
			det += C;

			if (det > 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}
}