import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int P[] = new int[N];
		int count = 0;
		for (int i = 0; i < K; i++) {
			int d = scanner.nextInt();
			for (int j = 0; j < d; j++) {
				int A = scanner.nextInt();
				P[A-1] += 1;
			}
		}

		for (int i = 0; i < N; i++) {
			if (P[i] == 0) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}