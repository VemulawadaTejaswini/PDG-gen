import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		Map<Integer, List<Character>> map = new HashMap<Integer, List<Character>>();
		List<Character> list = new ArrayList<Character>();
		list.add('R');
		list.add('U');
		list.add('D');
		map.put(0, list);
		list = new ArrayList<Character>();
		list.add('L');
		list.add('U');
		list.add('D');
		map.put(1, list);

		for (int i = 0; i < s.length; i++) {
			int key = i % 2;
			if (!map.get(key).contains(s[i])) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}