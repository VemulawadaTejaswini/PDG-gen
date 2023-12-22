import java.util.AbstractMap.SimpleEntry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			PriorityQueue<SimpleEntry<Integer, Integer>> queue = new PriorityQueue<>((e1, e2) -> {
				return Integer.compare(e1.getValue(), e2.getValue());
			});
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				queue.add(new SimpleEntry<Integer, Integer>(a[i], b[i]));
			}
			SimpleEntry<Integer, Integer> entry;
			int current = 0;
			while((entry = queue.poll()) != null) {
				if(current + entry.getKey() > entry.getValue()) {
					System.out.println("No");
					System.exit(0);
				} else {
					current += entry.getKey();
				}
			}
			System.out.println("Yes");
		}

	}

}
