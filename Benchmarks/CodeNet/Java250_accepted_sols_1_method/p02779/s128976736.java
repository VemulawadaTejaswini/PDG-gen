import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

		String ans = "YES";

		Arrays.sort(A);

		for (int j = 1; j < N; j++) {
			if (A[j - 1] == A[j]) {
				ans = "NO";
				break;
			}
		}
		System.out.println(ans);
	}
}
