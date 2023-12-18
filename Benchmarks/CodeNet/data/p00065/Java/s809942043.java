
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		Map<Integer, Integer> memo = new TreeMap<Integer, Integer>();
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			int n = Integer.parseInt(line.split(",")[0]);
			Integer a = 0;

			if ((a = memo.get(n)) == null) {
				memo.put(n, 1);
			} else {
				memo.put(n, a + 1);
			}
		}
		Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			int n = Integer.parseInt(line.split(",")[0]);
			Integer a = 0;
			if ((a = result.get(n)) == null) {
				if ((a = memo.get(n)) != null) {
					result.put(n, a + 1);
				}
			} else {
				result.put(n, a + 1);
			}
		}
		for (Entry<Integer, Integer> entry : result.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}