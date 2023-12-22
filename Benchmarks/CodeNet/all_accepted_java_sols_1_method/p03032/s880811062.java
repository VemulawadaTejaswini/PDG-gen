import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		int[] dq = new int[n];
		for ( int i = 0; i < n; i++ ) {
			dq[i] = in.nextInt();
		}
		in.close();

		int total = 0;
		for ( int l = 0; l < n; l++ ) {
			for ( int r = 0; r <= n - l; r++ ) {
				int lr = l + r;
				if ( lr > k || lr > n ) break;

				PriorityQueue<Integer> pool = new PriorityQueue<>();
				for ( int i = 0; i < l; i++ )
					pool.add(dq[i]);
				for ( int i = n - 1; n - r <= i; i-- )
					pool.add(dq[i]);

				for ( int i = k - lr; 0 < i; i-- ) {
					if ( !pool.isEmpty() && pool.peek() < 0 ) pool.poll();
					else break;
				}

				int temp = 0;
				for ( Integer i : pool ) temp += i;
				total = Math.max(total, temp);
			}
		}
		System.out.println(total);
	}
}