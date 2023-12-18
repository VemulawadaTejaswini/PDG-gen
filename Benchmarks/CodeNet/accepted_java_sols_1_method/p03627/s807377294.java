import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		Map<Long, Integer> map = new TreeMap<>(Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(str[i]);

			if (map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a, 1);
		}

		long w = 0;
		long h = 0;

		for (Long l : map.keySet()) {
			if (map.get(l) >= 4) {
				if (w == 0) {
					w = l;
					h = l;
				} else {
					h = l;
				}
			} else if (map.get(l) >= 2) {
				if (w == 0) {
					w = l;
				} else {
					h = l;
				}
			}
			if (w != 0 && h != 0)
				break;
		}

		System.out.println(w * h);
	}
}
