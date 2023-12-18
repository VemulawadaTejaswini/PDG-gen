
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n-- > 0) {
			char[] ch = scanner.next().toCharArray();
			Deque<Character> deque = new ArrayDeque<Character>();
			deque.push(ch[0]);
			for (int i = 1; i < ch.length; i++) {
				if (ch[i] == '>') {
					if (!deque.contains(ch[i + 1]))
						deque.offer(ch[i + 1]);
				} else if (ch[i] == '<') {
					if (!deque.contains(ch[i + 2]))
						deque.push(ch[i + 2]);
				}
			}
			for (Character c : deque) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}