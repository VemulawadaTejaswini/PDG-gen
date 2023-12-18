import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static class Worker implements Comparable<Worker>{
		int id;
		long result;
		int number;

		Worker (int id, long result, int number) {
			this.id = id;
			this.result = result;
			this.number = number;
		}

		public int compareTo(Worker x) {
			return this.number - x.number;
		}
	}

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Worker worker[];
		int n;
		int index;
		ArrayList<Worker> list;

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			index = 0;
			list = new ArrayList<Worker>();
			worker = new Worker[4001];

			for (int i = 0; i < n; i++) {
				int id = sc.nextInt();
				long cost = sc.nextLong();
				long lots = sc.nextLong();
				if (worker[id] == null) {
					worker[id] = new Worker(id, cost * lots, index++);
				} else {
					worker[id].result += (cost * lots);
				}
			}

			for (int i = 0; i < 4001; i++) {
				if (worker[i] != null && 1000000 <= worker[i].result) {
					list.add(worker[i]);
				}
			}
			Collections.sort(list);
			if (list.isEmpty()) {
				System.out.println("NA");
			} else {
				for (Worker w: list) {
					System.out.println(w.id);
				}
			}
		}
	}
}