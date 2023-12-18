import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);

		var sameSet = new HashSet<Integer>();
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				sameSet.add(a[i]);
			}
		}

		var result = 0;
		var set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (!sameSet.contains(a[i])) {
				var divisors = getDivisors(a[i]);
				var check = true;
				for (int j = 0; j < divisors.size(); j++) {
					if (set.contains(divisors.get(j))) {
						check = false;
						break;
					}
				}
				if (check) {
					result++;
				}
			}
			set.add(a[i]);
		}

		System.out.println(result);
	}

	public static List<Integer> getDivisors(int n) {
		var list = new ArrayList<Integer>();
		for (var i = 1; i < (int)Math.sqrt(n) + 1; i++) {
			if (n % i == 0) {
				list.add(i);
				var divisor = n / i;
				if (divisor != i) {
					list.add(divisor);
				}
			}
		}

		Collections.sort(list);
		return list;
	}
}
