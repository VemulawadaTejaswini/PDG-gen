import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		StringBuilder result = new StringBuilder();

		Map<Integer, Long> ds = null;

		while ((line = br.readLine()) != null) {

			//
			if (line.indexOf(" ") == -1) {
				if (ds != null) {
					int count = 0;
					for (Integer k : ds.keySet()) {
						if (ds.get(k) >= 1000000) {
							result.append(k + "\n");
							count++;
						}
					}
					if (count == 0) {
						result.append("NA\n");
					}
				}

				// init dataset.
				int n = Integer.parseInt(line);
				if (n == 0) {
					break;
				}
				ds = new LinkedHashMap<Integer, Long>();

				// read data.
				for (int i = 0; i < n; i++) {
					line = br.readLine();
					Integer c = Integer.parseInt(line.split(" ")[0]);
					Integer p = Integer.parseInt(line.split(" ")[1]);
					Integer q = Integer.parseInt(line.split(" ")[2]);
					if (!ds.containsKey(c)) {
						ds.put(c, (long) (p * q));
					} else {
						ds.put(c, (ds.get(c) + p * q));
					}
				}
			}
		}
		System.out.print(result.toString());
	}
}