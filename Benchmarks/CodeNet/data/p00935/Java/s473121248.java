import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Decimal Sequences
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());
		char[] nums = new char[n];

		StringTokenizer st;
		int _i = 0;
		while ((line = br.readLine()) != null && !line.isEmpty()) {
			st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				nums[_i] = st.nextToken().charAt(0);
				_i++;
			}
		}

		//classify
		SortedMap<Integer, Set<String>> lens = new TreeMap<>();
		outer:
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (nums[i] == '0' && i != j) continue outer;
				//
				int len = j - i + 1;
				char[] seq = Arrays.copyOfRange(nums, i, j + 1);
				lens.putIfAbsent(len, new HashSet<>());
				lens.get(len).add(String.valueOf(seq));
			}
		}

		//solve
		int ans = 0;
		outer:
		for (int i = 1; i <= n; i++) {
			if (!lens.containsKey(i)) continue;
			//
			int full = 0;
			if (i == 1) {
				full = 10;
			} else {
				full = (int) Math.pow(10, i) - (int) Math.pow(10, i - 1);
			}
			if (lens.get(i).size() < full) {
				int min, max;
				if (i == 1) {
					min = 0;
				} else {
					min = (int) Math.pow(10, i - 1);
				}
				max = (int) Math.pow(10, i) - 1;
				for (int j = min; j <= max; j++) {
					if (!lens.get(i).contains(Integer.toString(j))) {
						ans = j;
						break outer;
					}
				}
			}
		}
		System.out.println(ans);
	} //end main
}