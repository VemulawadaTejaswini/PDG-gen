import java.util.*;

public class Main {
	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				deq.addLast(sc.nextInt());
			} else {
				deq.addFirst(sc.nextInt());
			}
		}
		StringBuilder sb = new StringBuilder();
		while (deq.size() > 0) {
			if (deq.size() < n) {
				sb.append(" ");
			}
			if (n % 2 == 0) {
				sb.append(deq.pollFirst());
			} else {
				sb.append(deq.pollLast());
			}
		}
		System.out.println(sb);
	}
}
