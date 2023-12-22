import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String A[] = new String[N];
		int count = 1;
		for (int i = 0; i < N; i++) {
			A[i] = scanner.next();
		}
		Arrays.sort(A);

		for (int i = 0; i < N - 1; i++) {
			if (!(A[i].equals(A[i + 1]))) {
				count += 1;
			}
		}
		System.out.println(count);
	}
}
