import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		int max = 0;
		while (sc.hasNext()) {
			int v = sc.nextInt();
			System.out.println(v);
			if (map.containsKey(v)) {
				int t = map.get(v)+1;
				max = Math.max(max, t);
				map.put(v, t);
			} else {
				map.put(v, 1);
			}
		}

		List<Integer> ret = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()==max) ret.add(entry.getKey());
		}

		Collections.sort(ret);

		for (int i = 0;i < ret.size();i++) {
			System.out.println(ret.get(i));
		}
	}
}