
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String alphabet = "abcdefghijklmnopqrstuvwxyz";
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			// init
			for (int i = 0; i < alphabet.length(); i++) {
				map.put((char) alphabet.charAt(i), 0);
			}

			char[] N = scanner.next().toCharArray();
			Arrays.sort(N);

			for (char c : N) {
				if (map.containsKey(c)) {
					map.put(c, 1);
				}
			}
			boolean flg = true;
			for (Entry<Character, Integer> entry : map.entrySet()) {
				if (entry.getValue() == 0) {
					System.out.println(entry.getKey());
					flg = false;
					break;
				}
			}
			if (flg)
				System.out.println("None");
		}
	}
}