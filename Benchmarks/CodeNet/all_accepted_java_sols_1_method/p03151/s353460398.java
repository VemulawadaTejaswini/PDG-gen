import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n], b = new long[n];
		long sum = 0;
		for (int i = 0 ; i < n; i++) {
			a[i] = sc.nextLong();
			sum += a[i];
		}
		for (int i = 0 ; i < n; i++) {
			b[i] = sc.nextLong();
			sum -= b[i];
		}
		if (sum < 0) {
			System.out.println("-1");
			return;
		}
		sum = 0;
		int res = 0;
		List<Long> remains = new ArrayList<>();
		for (int i = 0 ; i < n; i++) {
			long d = a[i] - b[i];
			if (d < 0) {
				sum += d;
				res++;
			}
			else if (d > 0) remains.add(d);
		}
		Collections.sort(remains, Comparator.reverseOrder());
		for (long remain : remains) {
			if (sum >= 0) break;
			sum += remain;
			res++;
		}
		System.out.println(res);
	}
}