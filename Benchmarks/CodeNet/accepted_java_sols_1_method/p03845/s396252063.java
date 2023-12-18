import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int T[] = new int[N];
		for (int i = 0; i < N; i++) {
			T[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int P[] = new int[M];
		int X[] = new int[M];
		for (int i = 0; i < M; i++) {
			P[i] = scan.nextInt();
			X[i] = scan.nextInt();
		}

		for (int i = 0; i < M; i++) {
			int total = 0;
			for (int j = 0; j < N; j++) {
				if (P[i] == j + 1) {
					total += X[i];
				} else {
					total += T[j];
				}
			}
			System.out.println(total);
		}
	}

}
