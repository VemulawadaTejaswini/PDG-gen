import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt() - 1;
		}
		boolean[] memo = new boolean[n];
		memo[0] = true;
		ArrayDeque<Integer> deque = new ArrayDeque<>();
		deque.add(a[0]);
		int t, cnt = 1;
		boolean b = false;
		while (!deque.isEmpty()) {
			t = deque.poll();
			if (t == 1) {
				b = true;
				break;
			} else if (!memo[t]) {
				deque.add(a[t]);
				memo[t] = true;
				cnt++;
			} else {
				break;
			}
		}
		if (b) {
			System.out.println(cnt);
		} else {
			System.out.println(-1);
		}
	}
}
