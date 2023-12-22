import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Income Inequality
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int sum = 0;
			int[] arr = new int[n];
			arr[0] = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) {
				sum += arr[i] = parseInt(st.nextToken());
			}

			int avg = sum / n;
			int ans = 0;

			Arrays.sort(arr);

			for (int i = 0; i < n; i++) {
				if (arr[i] <= avg) ans++;
			}

			System.out.println(ans);
		}
	}
}
