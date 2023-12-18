import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final long d = sc.nextLong();
			
			if(d == 0){
				break;
			}
			
			final int n = sc.nextInt();
			final int m = sc.nextInt();

			long[] stores = new long[n + 1];
			stores[0] = 0;
			for (int i = 1; i < n; i++) {
				stores[i] = sc.nextLong();
			}
			stores[n] = d;

			Arrays.sort(stores);

			long sum = 0;

			for (int i = 0; i < m; i++) {
				long der = sc.nextLong();

				int start = 0;
				int end = n;

				while (end - start > 1) {
					int med = (start + end) / 2;

					if (stores[med] > der) {
						end = med;
					} else if (stores[med] < der) {
						start = med;
					} else {
						start = med;
						end = med;
					}
				}

				int ans = 0;

				if (start == end) {
					ans = start;
				} else {
					if (Math.abs(stores[start] - der) < Math.abs(stores[end]
							- der)) {
						ans = start;
					} else {
						ans = end;
					}
				}
				// System.out.println(stores[start] + " " + stores[end] + " " +
				// der + "" + ans);
				sum += (Math.abs(stores[ans] - der));
			}

			System.out.println(sum);
		}
	}

}