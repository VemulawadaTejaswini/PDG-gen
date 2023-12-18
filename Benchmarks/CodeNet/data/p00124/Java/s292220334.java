
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Map<String, Integer> map = new LinkedHashMap<String, Integer>();
			List<Integer> list = new ArrayList<Integer>();
			while (n-- > 0) {
				String str = scanner.next();
				int a = scanner.nextInt();
				scanner.next();
				int b = scanner.nextInt();
				int c = a * 3 + b;
				map.put(str, c);
				list.add(c);
			}
			Collections.sort(list);
			for (int i = list.size() - 1; i >= 0; i--) {
				for (Entry<String, Integer> entry : map.entrySet()) {
					if (entry.getValue() == list.get(i)) {
						System.out.println(entry.getKey() + ","
								+ entry.getValue());
						entry.setValue(-1);
						break;
					}
				}

			}
			System.out.println();
		}
	}
}