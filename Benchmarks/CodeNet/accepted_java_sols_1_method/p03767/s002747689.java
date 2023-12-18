
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[3 * n];

		for (int i = 0; i < 3 * n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		long answer = 0;
		for (int i = 1; i < n + 1; i++) {
			answer += a[3 * n - 2 * i];
		}

		System.out.println(answer);

	}

}
