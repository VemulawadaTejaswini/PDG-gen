import java.io.IOException;
import java.util.*;

/**
 */
class Main {
	final static int N = 10;

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String lines[] = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String line : lines) {
			if (map.containsKey(line)) {
				map.put(line, map.get(line) + 1);
			} else {
				map.put(line, 1);
			}
		}
		String mode_str = "";
		int mode_val = 0;
		String long_str = "";
		for (Map.Entry<String, Integer> e : map.entrySet()) {
			if (mode_val < e.getValue()) {
				mode_val = e.getValue();
				mode_str = e.getKey();
			}
			if (long_str.length() < e.getKey().length()) {
				long_str = e.getKey();
			}
		}
		System.out.println(mode_str + " " + long_str);
	}
}