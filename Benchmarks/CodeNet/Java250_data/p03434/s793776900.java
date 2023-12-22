import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer a[] = new Integer[N];

		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a, Collections.reverseOrder());
		int A = a[0], B = 0;

		for (int i = 1; i < N; i++) {
			if (i % 2 == 0) {
				A += a[i];
			} else {
				B += a[i];
			}
		}
		System.out.println(A - B);
	}
}
