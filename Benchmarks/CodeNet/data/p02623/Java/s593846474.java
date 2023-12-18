import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long k = sc.nextLong();

		LinkedList<Long> a = new LinkedList<Long>();
		LinkedList<Long> b = new LinkedList<Long>();

		for (long i = 0; i < n; i++) {
			long nn = sc.nextLong();
			a.add(nn);
		}

		for (long i = 0; i < m; i++) {
			long nn = sc.nextLong();
			b.add(nn);
		}

		long count = 0;
		long sum = 0;
		long min = 0;

		while (k > 0) {

			if (a.size() > 0 && b.size() > 0) {
				min = Math.min(a.get(0), b.get(0));
				if(a.get(0)-b.get(0)>0) {
					b.remove(0);
				}
				else {
					a.remove(0);
				}
			} else if (a.size() == 0 && b.size() > 0) {
				min = b.get(0);
				b.remove(0);
			} else if (a.size() > 0 && b.size() == 0) {
				min = a.get(0);
				a.remove(0);
			} else {
				break;
			}

			if (k >= min) {
				k -= min;
				count++;
			} else {
				break;
			}

		}

		System.out.println(count);

		sc.close();
	}
}
