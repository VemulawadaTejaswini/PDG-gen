import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		long[] a = new long[N];
		long[] b = new long[N];

		TreeMap<Long, Long> tmap = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();

			if (tmap.containsKey(a[i])) {
				tmap.put(a[i], tmap.get(a[i]) + b[i]);
			} else {
				tmap.put(a[i], b[i]);
			}
		}

		long sum = 0;
		for (Long cost : tmap.keySet())
        {
			long num = Math.min(M, tmap.get(cost));
			sum += cost * num;
			M -= num;
        }

		System.out.println(sum);
	}

}