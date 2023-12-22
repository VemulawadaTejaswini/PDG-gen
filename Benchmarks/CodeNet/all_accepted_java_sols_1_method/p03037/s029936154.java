import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M;
		N = sc.nextInt();
		M = sc.nextInt();
		Integer L[] = new Integer[M];
		Integer R[] = new Integer[M];

		for (int i = 0; i < M; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(L, Collections.reverseOrder());
		Arrays.sort(R);
		if (R[0] - L[0] < 0) {
			System.out.println(0);
		} else {
			System.out.println(R[0] - L[0] + 1);
		}
	}
}
