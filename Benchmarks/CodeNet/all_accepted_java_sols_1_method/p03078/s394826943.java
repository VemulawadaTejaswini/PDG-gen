import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int K = sc.nextInt();
		List<Long> a = new ArrayList<Long>(x);
		List<Long> b = new ArrayList<Long>(y);
		List<Long> c = new ArrayList<Long>(z);
		for (int i = 0; i < x; i++) {
			a.add(sc.nextLong());
		}
		for (int i = 0; i < y; i++) {
			b.add(sc.nextLong());
		}
		for (int i = 0; i < z; i++) {
			c.add(sc.nextLong());
		}
		sc.close();

		Collections.sort(a);
		Collections.reverse(a);
		Collections.sort(b);
		Collections.reverse(b);
		Collections.sort(c);
		Collections.reverse(c);

		List<Long> ans = new ArrayList<Long>();
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if ((i + 1) * (j + 1) > K) break;
				for (int k = 0; k < z; k++) {
					if ((i + 1) * (j + 1) * (k + 1) > K) break;
					ans.add(a.get(i) + b.get(j) + c.get(k));
				}
			}
		}

		Collections.sort(ans);
		Collections.reverse(ans);

		for (int i = 0; i < K; i++) {
			System.out.println(ans.get(i));
		}

	}
}
