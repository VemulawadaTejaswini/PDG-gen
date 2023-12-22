import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt(), q = s.nextInt();
			if (n < 1) {
				return;
			}

			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; ++i) {
				for (int m = s.nextInt(); m-- > 0;) {
					int d = s.nextInt();
					Integer x = map.get(d);
					if (x == null) {
						x = 0;
					}
					map.put(d, x + 1);
				}
			}

			List<Integer> list = new ArrayList<Integer>(map.keySet());
			Collections.sort(list);

			int max = map.values().size() > 0 ? Collections.max(map.values())
					: 0, result = 0;
			for (int x : list) {
				if (map.get(x) == max) {
					result = x;
					break;
				}
			}
			System.out.println(max < q ? 0 : result);
		}
	}
}