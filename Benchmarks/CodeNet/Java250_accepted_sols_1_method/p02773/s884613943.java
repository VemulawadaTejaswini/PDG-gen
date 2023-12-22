
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (m.containsKey(s)) {
				m.put(s, m.get(s) + 1);
			} else {
				m.put(s, 1);
			}
		}
		int max = 0;
		for (Integer i : m.values()) {
			max = Math.max(max, i);
		}
		
		List<String> list = new ArrayList<>();
		for (Map.Entry<String, Integer> e : m.entrySet()) {
			if (e.getValue() == max) {
				list.add(e.getKey());
			}
		}
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
	}
}
