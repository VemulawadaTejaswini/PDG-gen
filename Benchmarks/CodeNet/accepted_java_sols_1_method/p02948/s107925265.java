import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		@SuppressWarnings("unchecked") ArrayList<Integer>[] jobs = new ArrayList[m + 1]; // 遅延日数ごとに仕事をグルーピングする
		for ( int i = 0; i <= m; i++ ) {
			ArrayList<Integer> a = new ArrayList<>();
			a.add(0); // ダミー要素
			jobs[i] = a;
		}

		for ( int i = 0; i < n; i++ ) {
			int d = in.nextInt();
			int f = in.nextInt();
			if ( d > m ) continue; // 遅延日数的に候補になりえない仕事は除外
			jobs[d].add(f);
		}

		long total = 0;
		PriorityQueue<Integer> pool = new PriorityQueue<Integer>(Collections.reverseOrder()); // job候補のプール
		pool.add(0); // ダミー

		// m日目をゼロとして考え後退していく days:残り日数
		for ( int today = 0; today <= m; today++ ) {

			pool.addAll(jobs[today]);
			int daypay = (int) pool.poll();

			// System.out.println("days:" + today + " earn +=" + daypay);
			// System.out.println("pool" + pool);
			total += daypay;
		}

		System.out.println(total);
		in.close();
	}
}
