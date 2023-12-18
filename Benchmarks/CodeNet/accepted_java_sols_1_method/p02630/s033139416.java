import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> a = new HashMap<Integer, Integer>();
		BigDecimal sum = new BigDecimal(0);

		int n = Integer.parseInt(sc.next());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(sc.next());

			if (a.containsKey(m))
				a.replace(m, a.get(m) + 1);
			else
				a.put(m, 1);

			sum = sum.add(new BigDecimal(m));
		}

		int b, c, b_num, c_num;
		int q = Integer.parseInt(sc.next());
		for (int i = 0; i < q; i++) {
			b = Integer.parseInt(sc.next());
			c = Integer.parseInt(sc.next());

			b_num = 0;
			if (a.containsKey(b)) {
				b_num = a.remove(b);
				BigDecimal diff = new BigDecimal((c - b) * b_num);

				c_num = b_num;
				if (a.containsKey(c)) {
					c_num += a.get(c);
					a.replace(c, c_num);
				} else {
					a.put(c, c_num);
				}

				sum = sum.add(diff);
			}
			System.out.println(sum);
		}
	}

}
