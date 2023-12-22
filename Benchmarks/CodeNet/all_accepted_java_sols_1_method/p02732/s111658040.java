import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Map<Integer, Long> map = new HashMap<>();
		int a[] = new int[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int aa = Integer.parseInt(str[i]);
			a[i] = aa;

			if (map.containsKey(aa))
				map.put(aa, map.get(aa) + 1);
			else
				map.put(aa, 1L);
		}

		long res = 0;
		for (int key : map.keySet()) {
			res += map.get(key) * (map.get(key) - 1) / 2;
		}

		for (int i = 0; i < n; i++) {
			long val = map.get(a[i]);
			long before = val * (val - 1) / 2;
			long after = (val - 1) * (val - 2) / 2;
			System.out.println(res - before + after);
		}
	}
}