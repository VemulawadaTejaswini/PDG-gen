import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] A = new int[N];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				if (A[i] % A[j] == 0) break;
				if (j == N - 1) ans++;
			}
		}

		System.out.println(ans);

	}

}