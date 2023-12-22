import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Long A[] = new Long[n];

		for (int i = 0; i < n; i++) {
			A[i] = Long.parseLong(br.readLine());
		}

		Arrays.sort(A, Comparator.reverseOrder());

		if (n % 2 == 0) {
			long res = 0;
			for (int i = 0; i < n / 2 - 1; ++i)
				res += A[i] * 2;
			res += A[n / 2 - 1];
			res -= A[n / 2];
			for (int i = n / 2 + 1; i < n; ++i)
				res -= A[i] * 2;
			System.out.println(res);
		} else {
			long res1 = 0;
			for (int i = 0; i < n / 2 - 1; ++i)
				res1 += A[i] * 2;
			res1 += A[n / 2 - 1] + A[n / 2];
			for (int i = n / 2 + 1; i < n; ++i)
				res1 -= A[i] * 2;

			long res2 = 0;
			for (int i = 0; i < n / 2; ++i)
				res2 += A[i] * 2;
			res2 -= A[n / 2] + A[n / 2 + 1];
			for (int i = n / 2 + 2; i < n; ++i)
				res2 -= A[i] * 2;
			System.out.println(Math.max(res1, res2));
		}
	}
}