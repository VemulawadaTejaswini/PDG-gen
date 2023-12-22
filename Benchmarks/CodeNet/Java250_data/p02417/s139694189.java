import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String abc = "abcdefghijklmnopqrstuvwxyz";
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int i;
		for (i = 0; i < abc.length(); i++) {
			map.put(abc.substring(i, i + 1), 0);
		}
		while (in.hasNext()) {
			String input = in.next();
			for (i = 0; i < input.length(); i++) {
				String c = input.substring(i, i + 1).toLowerCase();
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}
			}
		}
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}