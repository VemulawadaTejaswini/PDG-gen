import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var p = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		var c = IntStream.range(0, n).map(i -> sc.nextInt()).toArray();
		sc.close();

		var result = Long.MIN_VALUE;
		for (var i = 0; i < n; i++) {
			var list = new ArrayList<Long>();
			var cp = i;
			var cs = 0L;
			while (true) {
				cp = p[cp] - 1;
				cs += c[cp];
				list.add(cs);
				if (cp == i) {
					break;
				}
			}
			var len = k % list.size();
			if (len == 0) {
				len = list.size();
			}
			var max = Long.MIN_VALUE;
			for (var j = 0; j < len; j++) {
				max = Math.max(max, list.get(j));
			}
			if (list.get(list.size() - 1) >= 0 && k > list.size()) {
				max += (long) list.get(list.size() - 1) * ((k - 1) / list.size());
			}
			result = Math.max(result, max);
		}
		System.out.println(result);
	}
}
