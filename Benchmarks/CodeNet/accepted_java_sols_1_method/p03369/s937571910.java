import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] N = scanner.next().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			map.put('o',0);
			map.put('x',0);

			for (char c : N) {
				map.put(c, map.get(c) + 1);
			}
			System.out.println(700 + (map.get('o') * 100));
		}
	}
}
