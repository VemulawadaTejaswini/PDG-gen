import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		try {
			for (;;) {
				line = br.readLine();
				if ("0".equals(line)) {
					break;
				}

				Map<String, List<long[]>> sales = new LinkedHashMap<>();
				int size = Integer.parseInt(line);
				for (int i = 0; i < size; i++) {
					String[] v = br.readLine().split(" ");
					String id = v[0];

					if (!sales.containsKey(id)) {
						sales.put(id, new ArrayList<>());
					}

					sales.get(id).add(new long[] { Long.parseLong(v[1]), Long.parseLong(v[2]) });
				}

				boolean na = true;
				for (Entry<String, List<long[]>> entry : sales.entrySet()) {
					long total = 0;

					for (long[] p : entry.getValue()) {
						total += p[0] * p[1];
					}

					if (total >= 1000000) {
						System.out.println(entry.getKey());
						na = false;
					}
				}

				if (na) {
					System.out.println("NA");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}