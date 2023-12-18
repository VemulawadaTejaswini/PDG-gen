import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] w = new int[n];
		for (int i = 0; i < n; i++)
			w[i] = scan.nextInt();
		Arrays.sort(w);

		Queue<Integer> bag = new PriorityQueue<Integer>(Comparator.reverseOrder());
		Queue<Integer> trucks = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			if (i < n - k)
				bag.add(w[i]);
			else
				trucks.add(w[i]);
		}
		while (!bag.isEmpty()) {
			int t = trucks.poll();
			int b = bag.poll();
//			System.out.println(t + " + " + b);
			trucks.add(t + b);
		}

		int ans = 0;
		while (!trucks.isEmpty())
			ans = trucks.poll();
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

