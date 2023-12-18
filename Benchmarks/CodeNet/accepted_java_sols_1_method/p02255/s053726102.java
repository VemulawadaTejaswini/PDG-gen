import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		for (int i = 1; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			for (int k : A) {
				sb.append(k);
				sb.append(" ");
			}

			System.out.println(sb.toString().trim());
			int v = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
		}
		StringBuilder sb = new StringBuilder();
		for (int k : A) {
			sb.append(k);
			sb.append(" ");
		}

		System.out.println(sb.toString().trim());
	}
}