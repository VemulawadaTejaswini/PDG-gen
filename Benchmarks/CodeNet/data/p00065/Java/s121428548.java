import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		String rec;
		while (!(rec = in.nextLine()).isEmpty()) {
			Integer num = Integer.valueOf(rec.split(",")[0]);
			m1.put(num, (m1.containsKey(num) ? m1.get(num) + 1 : 1));
		}
		SortedMap<Integer, Integer> m2 = new TreeMap<Integer, Integer>();
		while (in.hasNextLine()) {
			rec = in.nextLine();
			Integer num = Integer.valueOf(rec.split(",")[0]);
			if (m1.containsKey(num)) {
				m2.put(num, (m2.containsKey(num) ? m2.get(num) + 1 : 1));
			}
		}
		for (Integer key : m2.keySet()) {
			System.out.print(key);
			System.out.print(' ');
			System.out.print(m1.get(key) + m2.get(key));
			System.out.println();
		}
	}
}