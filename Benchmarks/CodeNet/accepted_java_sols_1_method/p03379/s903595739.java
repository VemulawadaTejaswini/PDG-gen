import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		long x[] = new long[n];
		long xx[] = new long[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			x[i] = Long.parseLong(str[i]);
			xx[i] = x[i];
		}

		Arrays.sort(x);
		long mid = x[n / 2];

		//System.out.println(Arrays.toString(x) + " " + mid);

		for (int i = 0; i < n; i++) {
			if (xx[i] >= mid) {
				System.out.println(x[n / 2 - 1]);
			} else {
				System.out.println(x[n / 2]);
			}
		}
	}
}