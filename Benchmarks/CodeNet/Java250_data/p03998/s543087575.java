import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		String c = scanner.next();
		Map<String, String> map = new HashMap<>();

		map.put("a", a);
		map.put("b", b);
		map.put("c", c);

		String key = "a";
		while (true) {
			String target = map.get(key).substring(0, 1);
			if (map.get(key).equals("end")) {
				System.out.println(key.toUpperCase());
				return;
			}

			if (map.get(key).substring(1, map.get(key).length()).length() >= 1) {
				map.put(key, map.get(key).substring(1, map.get(key).length()));
			} else {
				map.put(key, "end");
			}
			key = target;
		}

	}

}