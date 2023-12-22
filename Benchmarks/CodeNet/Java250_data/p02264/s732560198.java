import java.io.BufferedReader;
import java.io.InputStreamReader;

class Queue {

	private String[] names;
	private int[] times;
	private int head;
	private int tail;
	public Queue(int size) {
		names = new String[size + 1];
		times = new int[size + 1];
	}

	public void enqueue(String name, int time) {
		names[tail] = name;
		times[tail] = time;
		if (tail++ == names.length - 1) {
			tail = 0;
		}
	}

	public int dequeue() {
		if (head == names.length - 1) {
			head = 0;
			return names.length - 1;
		}
		return head++;
	}

	public boolean isEmpty() {
		return head == tail;
	}

	public String getName(int index) {
		return names[index];
	}

	public int getTime(int index) {
		return times[index];
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int n = Integer.parseInt(strs[0]);
		int q = Integer.parseInt(strs[1]);
		Queue queue = new Queue(n);
		StringBuilder sb = new StringBuilder();
		int sumTime = 0;
		for (int i = 0; i < n; i++) {
			strs = br.readLine().split(" ");
			int time = Integer.parseInt(strs[1]);
			if (time <= q) {
				sumTime += time;
				sb.append(strs[0] + " " + sumTime + "\n");
			} else {
				sumTime += q;
				queue.enqueue(strs[0], time - q);
			}
		}
		while (!queue.isEmpty()) {
			int entryIdx = queue.dequeue();
			String name = queue.getName(entryIdx);
			int time = queue.getTime(entryIdx);
			if (time <= q) {
				sumTime += time;
				sb.append(name + " " + sumTime + "\n");
			} else {
				sumTime += 	q;
				queue.enqueue(name, time - q);
			}
		}
		System.out.print(sb.toString());
	}
}