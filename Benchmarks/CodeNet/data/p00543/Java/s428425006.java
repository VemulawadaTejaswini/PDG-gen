import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int[] A_i = new int[N];
	static int M = sc.nextInt();
	public static void main(String[] args) {
		inputBibs();
		swappingBibs();

		for (int i = 0; i < N; i++) {
			System.out.println(A_i[i]);
		}

	}

	private static void inputBibs() {
		for (int i = 0; i < N; i++) {
			A_i[i] = sc.nextInt();
		}
	}

	private static void swappingBibs() {
		for (int k = 2; k <= M; k++) {
			for (int i = 0; i < N - 1; i++) {
				if (A_i[i] % k > A_i[i + 1] % k) {
					int tmp;
					tmp = A_i[i];
					A_i[i] = A_i[ i + 1];
					A_i[i+ 1 ] = tmp;
				}
			}
		}

	}

}

