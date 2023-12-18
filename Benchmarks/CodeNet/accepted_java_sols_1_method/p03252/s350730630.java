
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.nextLine();
			String t = sc.nextLine();
			Map<Character, Character> map1 = new HashMap<Character, Character>(s.length());
			Map<Character, Character> map2 = new HashMap<Character, Character>(s.length());

			for (int i = 0; i < s.length(); i++) {
				char tmps = s.charAt(i);
				char tmpt = t.charAt(i);
				if (map1.containsKey(tmps)) {
					if (!map1.get(tmps).equals(tmpt)) {
						System.out.println("No");
						return;
					}
				} else {
					map1.put(tmps, tmpt);
				}
				if (map2.containsKey(tmpt)) {
					if (!map2.get(tmpt).equals(tmps)) {
						System.out.println("No");
						return;
					}
				} else {
					map2.put(tmpt, tmps);
				}
			}
			System.out.println("Yes");
		}
	}
}
