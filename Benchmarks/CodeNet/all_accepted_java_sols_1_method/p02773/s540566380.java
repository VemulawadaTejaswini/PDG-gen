import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		br.close();

		int max = 0;
		for (int i : map.values()) {
			max = Math.max(max, i);
		}

		List<String> list = new ArrayList<>();
		for (String s : map.keySet()) {
			if (map.get(s) == max) {
				list.add(s);
			}
		}
		Collections.sort(list);

		for (String s : list) {
			System.out.println(s);
		}
	}
}
