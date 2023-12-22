import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int A = 0;
		int B = 0;
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			b[i] = a[N - i - 1];
		}
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				A += b[i];
			} else {
				B += b[i];
			}
		}
		System.out.println(A - B);
		sc.close();

	}

}