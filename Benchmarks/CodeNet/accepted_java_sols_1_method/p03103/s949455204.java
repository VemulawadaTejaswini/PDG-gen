
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Map<Integer, Integer> AB = new HashMap<Integer, Integer>();
		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (AB.get(a) != null) {
				b += AB.get(a);
				A[i] = 0;
			} else {
				A[i] = a;
			}
			AB.put(a, b);
		}

		Arrays.sort(A);

		int i = 0;
		int b = 0;
		long result = 0L;
		while (true) {
			if (A[i] == 0) {
				i++;
				continue;
			}
			b = AB.get(A[i]);
			if (b < M) {
				result += (long) A[i] * b;
			} else {
				result += (long) A[i] * M;
			}

			M = M - b;
			if (M <= 0) {
				break;
			}
			i++;
		}

		System.out.println(result);
	}
}
