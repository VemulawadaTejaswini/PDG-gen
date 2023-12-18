import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String w = sc.nextLine();
			int len = w.length();

			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < len; i++) {
				String s = w.substring(i, i + 1);
				if (map.containsKey(s)) {
					map.put(s, map.get(s) + 1);
				} else {
					map.put(s, 1);
				}
			}

			for (Iterator<String> iter = map.keySet().iterator(); iter.hasNext();) {
				if (map.get(iter.next()).intValue() % 2 != 0) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");

		} finally {
			sc.close();
		}
	}
}