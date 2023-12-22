import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		int n, q, t;
		int t_sum = 0;
		String pros;
		Deque<String> name = new ArrayDeque<>();
		Deque<Integer> time = new ArrayDeque<>();

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		q = sc.nextInt();

		for (int i = 0; i < n; i++) {
			name.offerLast(sc.next());
			time.offerLast(sc.nextInt());
		}

		while (time.size() != 0) {
			t = time.poll();
			if (t <= q) {
				t_sum += t;
				pros = name.poll();
				System.out.println(pros + " " + t_sum);
			} else {
				t_sum += q;
				time.offerLast(t - q);
				name.offerLast(name.poll());
			}
		}
	}
}