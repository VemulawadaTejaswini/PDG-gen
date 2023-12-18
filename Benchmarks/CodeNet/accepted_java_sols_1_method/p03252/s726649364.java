import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.nextLine();
		String T = in.nextLine();
		in.close();
		Map<Character, Character> charMap = new HashMap<>();

		boolean result = true;
		for (int i = 0; i < S.length(); ++i) {
			Character s = S.charAt(i);
			Character t = T.charAt(i);
			if (!charMap.containsKey(s) && !charMap.containsValue(t)) {
				charMap.put(s, t);
			} else {
				if (!t.equals(charMap.get(s))) {
					result = false;
					break;
				}
			}
		}
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}