import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.solveB();
	}

	private void solveB() {
		int min = 0;
		int max = 0;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[M];
		for (int i = 0; i < M; i++) {
			A[i] = sc.nextInt();
		}



		for (int j = 0; j <= M - 1; j++) {
			if (X > A[j]) {
				min = min + 1;
			}
		}
		for (int k = M - 1; k >= 0; k--) {
			if (X < A[k]) {
				max = max + 1;
			}
		}

		if (min > max) {
			System.out.println(max);
		} else if (min < max) {
			System.out.println(min);
		} else {
			System.out.println(min);
		}

		return;
	}

}