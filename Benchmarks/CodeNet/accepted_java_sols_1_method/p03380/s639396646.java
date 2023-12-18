import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int a[] = new int[N];
		int max = 0;

		int i;
		for (i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if (max < a[i]) {
				max = a[i];
			}
		}

		Arrays.sort(a);

		// maxは除いてよい。
		int end = N - 1 - 1;

		int r_max = max / 2;
		int result;
		int r = a[end];
		int pre_result = Math.abs(a[end] - r_max);

		for (i = end; i >= 0; i--) {
			result = Math.abs(a[i] - r_max);
			if (result == 0) {
				r = a[i];
				break;
			} else {
				if (result < pre_result) {
					r = a[i];
					pre_result = result;
				}

			}
		}
		System.out.println(max + " " + r);
	}
}
