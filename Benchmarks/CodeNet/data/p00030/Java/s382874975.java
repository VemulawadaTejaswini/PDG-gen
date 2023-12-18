
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		while (true) {
			String line = reader.readLine();
			if (line.equals("0 0")) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			int n = Integer.parseInt(tokenizer.nextToken());
			int s = Integer.parseInt(tokenizer.nextToken());

			Map<int[], Integer> memo = new HashMap<int[], Integer>();
			memo.put(new int[0], 0);
			int count = 0;
			for (int i = 0; i < 10; i++) {
				Map<int[], Integer> memotmp = new HashMap<int[], Integer>();
				memotmp.putAll(memo);

				for (Entry<int[], Integer> entry : memo.entrySet()) {
					if (entry.getKey().length == n || entry.getValue() + i > s) {
						continue;
					}
					int[] nearray = Arrays.copyOf(entry.getKey(),
							entry.getKey().length + 1);
					nearray[nearray.length - 1] = i;
					int sum = entry.getValue() + i;

					memotmp.put(nearray, sum);
					if (nearray.length == n && sum == s) {
						count++;
					}

				}
				memo = memotmp;
			}
			/*
			 * memo.entrySet().forEach( l ->
			 * System.out.println(Arrays.toString(l.getKey()) + " -> " +
			 * l.getValue()));
			 */
			System.out.println(count);
		}
	}
}