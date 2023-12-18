import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int[] A = Arrays.stream(sc.nextLine().split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
		int[] X = new int[N];
		int S = Arrays.stream(A).sum();

		X[0] = S;
		for (int i = 1; i < N; i += 2) X[0] -= 2 * A[i];
		for (int i = 1; i < N; i++) X[i] = 2 * A[i - 1] - X[i - 1];

		Arrays.stream(X).forEach(s -> System.out.print(s + " "));
	}
}