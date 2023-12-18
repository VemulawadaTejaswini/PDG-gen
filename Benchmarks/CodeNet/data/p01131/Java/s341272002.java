import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<Character, Character> firstRule = new HashMap<Character, Character>();
	private static Map<Character, Character> nextRule = new HashMap<Character, Character>();
	static {
		firstRule.put('1', '.');
		firstRule.put('2', 'a');
		firstRule.put('3', 'd');
		firstRule.put('4', 'g');
		firstRule.put('5', 'j');
		firstRule.put('6', 'm');
		firstRule.put('7', 'p');
		firstRule.put('8', 't');
		firstRule.put('9', 'w');

		// 1
		nextRule.put('.', ',');
		nextRule.put(',', '!');
		nextRule.put('!', '?');
		nextRule.put('?', ' ');
		nextRule.put(' ', '.');

		// 2
		nextRule.put('a', 'b');
		nextRule.put('b', 'c');
		nextRule.put('c', 'a');

		// 3
		nextRule.put('d', 'e');
		nextRule.put('e', 'f');
		nextRule.put('f', 'd');

		// 4
		nextRule.put('g', 'h');
		nextRule.put('h', 'i');
		nextRule.put('i', 'g');

		// 5
		nextRule.put('j', 'k');
		nextRule.put('k', 'l');
		nextRule.put('l', 'j');

		// 6
		nextRule.put('m', 'n');
		nextRule.put('n', 'o');
		nextRule.put('o', 'm');

		// 7
		nextRule.put('p', 'q');
		nextRule.put('q', 'r');
		nextRule.put('r', 's');
		nextRule.put('s', 'p');

		// 8
		nextRule.put('t', 'u');
		nextRule.put('u', 'v');
		nextRule.put('v', 't');

		// 9
		nextRule.put('w', 'x');
		nextRule.put('x', 'y');
		nextRule.put('y', 'z');
		nextRule.put('z', 'w');
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.next());
		for (int i = 0; i < N; i++) {
			String in = s.next();
			System.out.println(solve(in));
		}
	}

	private static String solve(String in) {
		StringBuilder buf = new StringBuilder();
		Character current = null;
		for (char ch : in.toCharArray()) {
			if (ch == '0' && current != null) {
				buf.append(current);
				current = null;
				continue;
			}
			current = nextChar(ch, current);
		}
		return buf.toString();
	}

	private static Character nextChar(char in, Character current) {
		return (current == null) ? firstRule.get(in) : nextRule.get(current);
	}

}