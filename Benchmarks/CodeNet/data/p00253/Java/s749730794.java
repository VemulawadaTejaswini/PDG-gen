import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			int[] grass = new int[n + 1];
			Map<Integer, Integer> diffs = new HashMap<Integer, Integer>();

			StringTokenizer st = new StringTokenizer(br.readLine());

			grass[0] = Integer.parseInt(st.nextToken());
			for (int i = 1; i < n + 1; i++) {
				grass[i] = Integer.parseInt(st.nextToken());

				int diff = grass[i] - grass[i - 1];
				if (diffs.containsKey(diff)) {
					diffs.put(diff, diffs.get(diff) + 1);
				} else {
					diffs.put(diff, 1);
				}
			}
			int diff = 0;
			for (Integer key : diffs.keySet()) {
				if (diffs.get(key) >= 2) {
					diff = key;
					break;
				}
			}
			for (int i = 0; i < n - 1; i++) {
				if (grass[i] + diff != grass[i + 1] || grass[i + 1] + diff != grass[i + 2]) {
					if (grass[i] + diff == grass[i + 1]) {
						System.out.println(grass[i + 2]);
					} else if (grass[i + 1] + diff == grass[i + 2]) {
						System.out.println(grass[i]);
					} else {
						System.out.println(grass[i] + 1);
					}
					break;
				}
			}
		}
	}
}