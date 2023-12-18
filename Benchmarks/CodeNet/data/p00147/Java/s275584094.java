import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class Group {
		int id;
		int p;
		int time;
		int tq;
		int j;

		Group(int id) {
			this.id = id;
			if (id % 5 == 1) {
				p = 5;
			} else {
				p = 2;
			}
			time = 17 * (id % 2) + 3 * (id % 3) + 19;
		}

	}

	void run() {
		boolean[] used = new boolean[17];
		LinkedList<Group> q = new LinkedList<Group>();
		LinkedList<Group> f = new LinkedList<Group>();
		int[] ans = new int[100];
		for (int i = 0; i < 100; i++) {
			q.add(new Group(i));
		}
		int timer = 0;
		for (;; timer++) {
//			System.out.println(timer - 1 + " " + Arrays.toString(used));
			if (q.isEmpty()) {
				break;
			}
			for (Group g : f) {
				g.time--;
				if (g.time == 0) {
					for (int i = g.j; i < g.j + g.p; i++) {
						used[i] = false;
					}
				}
			}
			for (;;) {
				if(q.isEmpty()){
					break;
				}
				Group g = q.peekFirst();
				if (timer < g.id * 5) {
					break;
				}
				int j = 0;
				int k = 0;
				for (int i = 0; i < 17; i++) {
					if (used[i]) {
						j = i + 1;
						k = 0;
					} else {
						k++;
						if (k == g.p) {
							break;
						}
					}
				}
				if (k != g.p) {
					break;
				}

				f.add(q.poll());
				g.tq = timer;
				g.j = j;
				ans[g.id] = g.tq - g.id * 5;
				for (int i = j; i < g.j + g.p; i++) {
					used[i] = true;
				}
			}
		}
		for (;;) {
			if (!sc.hasNextInt()) {
				break;
			}
			int n = sc.nextInt();
			System.out.println(ans[n]);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}