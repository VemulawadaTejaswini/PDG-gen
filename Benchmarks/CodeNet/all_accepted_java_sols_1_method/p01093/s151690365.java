import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Selection of Participants of an Experiment
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			int[] arr = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int i = 0; i < n; i++) arr[i] = parseInt(st.nextToken());

			Arrays.sort(arr);

			int min = Integer.MAX_VALUE;

			for (int i = 0; i < n - 1; i++) {
				min = Math.min(min, arr[i + 1] - arr[i]);
				if (min == 0) break;
			}

			System.out.println(min);

		} //end while
	} //end main
}