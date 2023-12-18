import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String str;
		Stack<Integer> S1 = new Stack<Integer>();
		Stack<pair> S2 = new Stack<pair>();
		str = cin.next();
		int i, sum = 0;
		for (i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (ch == '\\') {
				S1.push(i);
			} else if (ch == '/' && !S1.empty()) {
				int j = S1.peek();
				S1.pop();
				int a = i - j;
				sum += a;
				while (!S2.empty() && S2.peek().first > j) {
					a += S2.peek().second;
					S2.pop();
				}
				S2.push(new pair(j, a));
			}
		}
		System.out.printf("%d\n%d", sum, S2.size());
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		while(S2.size() > 0) {
			deque.offer(S2.peek().second);
			S2.pop();
		}
		while (deque.size() > 0) {
			System.out.printf(" %d", deque.pollLast());
		}
		System.out.println();
	}
}

class pair {
	int first;
	int second;
	pair(int f, int s) {
		first = f;
		second = s;
	}
}
