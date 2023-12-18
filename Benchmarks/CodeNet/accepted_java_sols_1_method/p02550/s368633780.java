import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextLong();
		var x = sc.nextLong();
		var m = sc.nextLong();
		sc.close();

		var list = new ArrayList<Long>();
		var set = new HashSet<Long>();
		var sum = 0L;
		var a = x;
		for (var i = 1L; i <= n; i++) {
			if (set.contains(a)) {
				var index = list.indexOf(a);
				var count = list.size() - index;
				var nd = (n - i + 1) / count;
				var nm = (n - i + 1) % count;
				for (var j = index; j < list.size(); j++) {
					var v = list.get(j);
					sum += v * nd;
					if (j < index + nm) {
						sum += v;
					}
				}
				break;
			}
			list.add(a);
			set.add(a);
			sum += a;
			a = (a * a) % m;
		}

		System.out.println(sum);
	}
}
