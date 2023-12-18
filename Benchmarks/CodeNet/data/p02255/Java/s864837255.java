import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int v;
		int j;

		out_put(A);

		for (int i = 1; i < N; i++) {
			v = A[i];
			j = i - 1;
			while (j >= 0 && A[j] > v) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;

			out_put(A);
		}

		sc.close();
	}

	private static void out_put(int array[]) {

		System.out.printf("%d", array[0]);

		for (int i = 1; i < array.length; i++) {
			System.out.printf(" %d", array[i]);
		}
		System.out.printf("\n");
	}
}

