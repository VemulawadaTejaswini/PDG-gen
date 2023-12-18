import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

class Main {

	static ArrayDeque<String> queue = new ArrayDeque<String>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String order = br.readLine();
			if (order.contains("F")) {
				queue.poll();
			} else if (order.contains("L")) {
				queue.pollLast();
			} else if (order.contains("insert")) {
				queue.addFirst(order.replace("insert ", ""));
			} else {
				queue.removeFirstOccurrence(order.replace("delete ", ""));
			}
		}
		System.out.print(queue.poll());
		while(queue.isEmpty() != true){
			System.out.print(" " + Integer.parseInt(queue.poll()));
		}
	}
}