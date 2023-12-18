import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		ArrayDeque<Character> deq = new ArrayDeque<>();
		deq.add('o');
		for(char c : s.toCharArray()) {
			char before = deq.getLast();
			if(before=='(' && c==')') {
				deq.removeLast();
			} else {
				deq.add(c);
			}
		}
		deq.poll();
		while(!deq.isEmpty()) {
			char c = deq.poll();
			if(c==')') {
				sb.insert(0, '(');
			} else {
				sb.append(')');
			}
		}
		System.out.println(sb.toString());
	}
}