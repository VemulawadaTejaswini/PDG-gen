import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int a,b;
		String[] ar = sc.nextLine().split(" ");
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i=0; i<ar.length; i++) {
			if (ar[i].equals("+")) {
				a = deque.removeFirst();
				b = deque.removeFirst();
				deque.addFirst(a+b);
			}
			else if (ar[i].equals("-")) {
				a = deque.removeFirst();
				b = deque.removeFirst();
				deque.addFirst(b-a);
			}
			else if (ar[i].equals("*")) {
				a = deque.removeFirst();
				b = deque.removeFirst();
				deque.addFirst(a*b);
			}
			else {
				deque.addFirst(Integer.parseInt(ar[i]));
			}
		}
		out.println(deque.getFirst());
	}
}

