import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * The Third Permutation
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		int n = parseInt(br.readLine());
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = parseInt(br.readLine());
		}

		Arrays.sort(a);

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					list.add(a[i] * (int) (Math.pow(10, (int) Math.log10(a[j]) + 1)) + a[j]);
				}
				if (list.size() > 1000) {
					break;
				}
			}
		}

		Collections.sort(list);

		System.out.println(list.get(2));

	}
}