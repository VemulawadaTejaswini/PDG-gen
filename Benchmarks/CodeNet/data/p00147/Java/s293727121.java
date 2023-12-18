
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] c = new int[17];
		int[] p = new int[100];
		int[] w = new int[100];
		int[] sit = new int[100];
		for (int i = 0; i < 100; i++) {
			p[i] = i % 5 == 1 ? 5 : 2;
			w[i] = 17 * (i % 2) + 3 * (i % 3) + 19;
		}
		int i = 0;
		int t = 0;
		Deque<Integer> deque = new ArrayDeque<Integer>();
		Deque<Integer> m = new ArrayDeque<Integer>();
		int a = -1;
		loop1: while (true) {
			if (t == i * 5 && i < 100) {
				deque.offer(i++);
				m.offer(t);
			}
			for (int k = 0; k < 17; k++) {
				c[k] = Math.max(0, c[k] - 1);
			}
			if (!deque.isEmpty()) {
				int de = deque.peekFirst();
				a = getA(p[de], c);
			}
			while (!deque.isEmpty() && a != -1) {

				int id = deque.poll();
				for (int j = a; j < a + p[id]; j++) {
					c[j] = w[id];
				}
				sit[id] = t - m.pollFirst();
				if (id == 99) {
					break loop1;
				}

				if (!deque.isEmpty()) {
					int de = deque.peekFirst();
					a = getA(p[de], c);
				} else {
					break;
				}
			}
			t++;
		}
		while (scanner.hasNext()) {
			int n = scanner.nextInt();
			System.out.println(sit[n]);
		}
	}

	private static int getA(int d, int[] c) {
		int count = 0;
		int a = -1;
		for (int i = 0; i < 17; i++) {
			if (c[i] == 0) {
				count++;
				if (d == count) {
					return i - count + 1;
				}
			}else{
				count = 0;
			}
		}
		return a;
	}

}