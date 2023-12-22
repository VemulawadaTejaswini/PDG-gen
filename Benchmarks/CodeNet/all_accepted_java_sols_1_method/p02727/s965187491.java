import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int a = Integer.parseInt(str[2]);
		int b = Integer.parseInt(str[3]);
		int c = Integer.parseInt(str[4]);

		PriorityQueue<Long> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Long> pq2 = new PriorityQueue<>(Comparator.reverseOrder());
		PriorityQueue<Long> pq3 = new PriorityQueue<>(Comparator.reverseOrder());

		str = br.readLine().split(" ");
		for (int i = 0; i < a; i++) {
			long l = Long.parseLong(str[i]);
			pq1.add(l);
		}
		str = br.readLine().split(" ");
		for (int i = 0; i < b; i++) {
			long l = Long.parseLong(str[i]);
			pq2.add(l);
		}
		str = br.readLine().split(" ");
		for (int i = 0; i < c; i++) {
			long l = Long.parseLong(str[i]);
			pq3.add(l);
		}

		PriorityQueue<Long> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < x; i++) {
			pq.add(pq1.poll());
		}

		for (int i = 0; i < y; i++) {
			pq.add(pq2.poll());
		}

		for (long l : pq3) {
			pq.add(l);
		}

		long sum = 0;

		for (int i = 0; i < x + y; i++) {
			sum += pq.poll();
		}

		System.out.println(sum);
	}
}
