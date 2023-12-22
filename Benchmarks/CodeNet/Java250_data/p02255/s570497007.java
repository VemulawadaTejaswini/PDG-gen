
import java.util.Scanner;

public class Main {
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++)
			A[i] = scanner.nextInt();
		
		trace(A, n);

		for (int i = 1; i < n; i++) {
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			trace(A, n);
		}
		System.out.print(builder);
	}

	private static void trace(int[] A, int n) {
		for (int i = 0; i < n; i++) {
			if (i > 0)
				builder.append(" ");
			builder.append(A[i]);
		}
		builder.append("\n");
	}
}