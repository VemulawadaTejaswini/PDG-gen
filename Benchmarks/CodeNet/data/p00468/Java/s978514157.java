
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while ((n = in.nextInt()) > 0) {
			Map<String, Set<String>> map = new HashMap<String, Set<String>>();
			int m = in.nextInt();
			map.put("1", new HashSet<String>());
			for (int i = 0; i < m; i++) {
				String a = in.next();
				String b = in.next();
				Set<String> af;
				if (map.containsKey(a)) {
					af = map.get(a);
				} else {
					af = new HashSet<String>();
					map.put(a, af);
				}
				af.add(b);
				Set<String> bf;
				if (map.containsKey(b)) {
					bf = map.get(b);
				} else {
					bf = new HashSet<String>();
					map.put(b, bf);
				}
				bf.add(a);
			}
			Set<String> xmas = map.remove("1");
			for (Iterator<Set<String>> it = map.values().iterator(); it
					.hasNext();) {
				Set<String> ff = it.next();
				if (ff.contains("1")) {
					xmas.addAll(ff);
				}
			}
			xmas.remove("1");
			System.out.println(xmas.size());
		}
	}
}