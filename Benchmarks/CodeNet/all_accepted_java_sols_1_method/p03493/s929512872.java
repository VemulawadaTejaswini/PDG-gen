
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] array = scanner.next().toCharArray();
			Map<Character, Integer> map = new HashMap<>();
			map.put('0',0);
			map.put('1',0);

			for (char c : array) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c)+ 1);
				}
			}
			System.out.println(map.get('1'));
		}
	}
}
