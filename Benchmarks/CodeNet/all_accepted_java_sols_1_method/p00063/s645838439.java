import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = 0;
		char[] a;
		Deque<Character> deq = new LinkedList<Character>();
		boolean isABA = true;
		while (in.hasNext()) {
			deq.clear();
			a = in.next().toCharArray();
			for (int i = 0; i < a.length; i++) {
				deq.add(Character.valueOf(a[i]));
			}
			isABA = true;
			while (deq.size() >= 2 && isABA) {
				isABA = deq.pollFirst() == deq.pollLast();
			}
			if (isABA) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}