import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<String> s = new Stack<String>();
		Queue<String> q = new LinkedList<String>();

		while (true) {
			String order = sc.next();
			if (order.equals("quit"))
				break;
			else if (order.equals("pop"))
				q.add(s.pop());
			else
				s.push(sc.next());
		}

		while (!q.isEmpty())
			System.out.println(q.poll());

	}

}