import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int head = 0;
	static int tail = 0;
	static Process[] queue = new Process[100005];

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String nq[] = br.readLine().split(" ");
			int n = Integer.parseInt(nq[0]);
			int q = Integer.parseInt(nq[1]);
			int total = 0;
			for (int i = 0; i < n; i++) {
				String[] tmp = br.readLine().split(" ");
				String name = tmp[0];
				int time = Integer.parseInt(tmp[1]);
				Process p = new Process(name, time);
				enqueue(p);
			}
			while (head != tail) {
				Process cur = dequeue();
				if (cur.time > q) {
					cur.time -= q;
					total += q;
					enqueue(cur);
				} else {
					total += cur.time;
					System.out.println(cur.name + " " + total);
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void enqueue(Process p) {
		if ((tail + 1) % queue.length == head) {
			System.err.println("キューが満タンです");
			return;
		}
		queue[tail] = p;
		tail = (tail + 1) % queue.length;
	}

	static Process dequeue() {
		Process ret = null;
		if (head == tail) {
			System.err.println("キューが空です");
		} else {
			ret = queue[head];
			head = (head + 1) % queue.length;
		}

		return ret;
	}

}

class Process {
	String name;
	int time;

	public Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}
