import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String s = sc.next();

		Map<Character, Integer> map = new HashMap<>();

		map.put('R', 0);
		map.put('B', 0);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c=='R') {
				int cnt = map.get('R') + 1;
				map.put('R', cnt);
			} else {
				int cnt = map.get('B') + 1;
				map.put('B', cnt);
			}
		}
		int r = map.get('R');
		int b = map.get('B');
		if (r > b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
