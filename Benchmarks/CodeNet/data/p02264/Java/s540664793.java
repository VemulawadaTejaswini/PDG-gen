import java.util.Scanner;

public class Main {

	public static int LEN = 100005;

	public static P[] Q = new P[LEN];
	public static int head, tail, n;

	public static void enqueue(P x) {
		Q[tail] = x;
		tail = (tail + 1) % LEN;
	}

	public static P dequeue() {
		P x = Q[head];
		head = (head + 1) % LEN;
		return x;
	}

	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < LEN; i++) {
			Q[i] = new P();
		}
		int elaps = 0, c;
		int i, q;
		P u;
		n = sc.nextInt();
		q = sc.nextInt();
		for (i = 1; i <= n; i++) {
			Q[i].setName(sc.next());
			Q[i].setTime(sc.nextInt());
		}

		while (head != tail) {
			u = dequeue();
			c = min(q, u.getTime());
			u.setTime(u.getTime() - c);
			elaps += c;
			if (u.getTime() > 0) {
				enqueue(u);
			} else {

			}
		}
		sc.close();
	}
}

package alds1_3_b_Queue;

public class P {

	private String name;
	private int time;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}

