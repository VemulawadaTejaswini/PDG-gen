import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> list = new LinkedList<String>();
		Map<String, Long> map = new HashMap<String, Long>();
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n != 0) {
				list.clear();
				map.clear();
				for (int i = 0; i < n; i++) {
					String num = in.next();
					long l = in.nextLong() * in.nextLong();
					if (!list.contains(num)) {
						list.add(num);
						map.put(num, l);
					} else {
						map.put(num, map.get(num) + l);
					}
				}
				boolean has = false;
				for (String st : list) {
					if (map.get(st).compareTo(Long.valueOf(1000000)) >= 0) {
						has = true;
						System.out.println(st);
					}
				}
				if (!has) {
					System.out.println("NA");
				}
			}
		}
	}
}