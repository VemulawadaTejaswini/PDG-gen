import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		String rec;
		while (!(rec = in.nextLine()).isEmpty()) {
			String num = rec.split(",")[0];
			m1.put(num, (m1.containsKey(num) ? m1.get(num) + 1 : 1));
		}
		SortedMap<String, Integer> m2 = new TreeMap<String, Integer>();
		while (in.hasNextLine()) {
			rec = in.nextLine();
			String num = rec.split(",")[0];
			if (m1.containsKey(num)) {
				m2.put(num, (m2.containsKey(num) ? m2.get(num) + 1 : 1));
			}
		}
		for (String key : m2.keySet()) {
			System.out.print(key);
			System.out.print(' ');
			System.out.print(m1.get(key) + m2.get(key));
			System.out.println();
		}
	}
}