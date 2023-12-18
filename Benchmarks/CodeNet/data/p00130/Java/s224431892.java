
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
			for (int i = 3; i < ch.length; i += 3) {
				if (!deque.contains(ch[i])) {
					if (ch[i - 1] == '>') {
						deque.offer(ch[i]);
					} else {
						deque.push(ch[i]);
					}
				}
			}
			for (Character c : deque) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}