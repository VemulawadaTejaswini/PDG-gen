import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new LinkedList<>();
		String tmp = "";
		while (sc.hasNext()) {
			switch ((tmp = sc.next()).charAt(tmp.length() - 1)) {
				case '+':
					deque.push(deque.poll() + deque.poll());
					break;
				case '-':
					int n = deque.poll();
					deque.push(deque.poll() - n);
					break;
				case '*':
					deque.push(deque.poll() * deque.poll());
					break;
				default:
					deque.push(Integer.parseInt(tmp));
					break;
			}
		}
		System.out.println(deque.poll());
	}
}

