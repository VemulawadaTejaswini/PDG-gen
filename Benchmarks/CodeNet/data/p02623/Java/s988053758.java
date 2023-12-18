import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long k = sc.nextLong();
		Queue QueueA = new Queue(n);
		Queue QueueB = new Queue(m);
		for(int i = 0; i < n; i++) {
			QueueA.enque(sc.nextLong());
		}
		for(int i = 0; i < m; i++) {
			QueueB.enque(sc.nextLong());
		}
		sc.close();
		int answer = 0;
		long time = 0L;
		long a = 0L;
		long b = 0L;
		for(int i = 0; i < (n + m); i++) {
			if(QueueA.isEmpty()) a = Long.MAX_VALUE;
			else if(a == 0L) a = QueueA.deque();
			if(QueueB.isEmpty()) b = Long.MAX_VALUE;
			else if(b == 0L) b = QueueB.deque();
			// prtln("#a=" + a + " b=" + b);
			// aから読む
			if(a < b) {
				time += a;
				// prtln("#a " + a + " time " + time);
				a = 0L;
			} else {
				// bから読む
				time += b;
				// prtln("#b " + b + " time " + time);
				b = 0L;
			}
			if(time <= k) answer++;
			else break;
		}
		prtln(answer);
	}
	public static <T> void prtln(T t) { System.out.println(t); }
}
class Queue {
	int max;
	int front;
	int rear;
	int num;
	long[] que;
	public Queue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		que = new long[max];
	}
	public void enque(long x) {
		que[rear++] = x;
		num++;
		if(rear == max) rear = 0;
 	}
	public long deque() {
		long x = que[front++];
		num--;
		if(front == max) front = 0;
		return x;
	}
	public boolean isEmpty() {
		return num <= 0;
	}
}
