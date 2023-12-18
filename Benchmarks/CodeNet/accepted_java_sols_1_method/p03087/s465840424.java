import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String s = sc.next();
		int[] l = new int[q];
		int[] r = new int[q];
		for (int i = 0; i < q; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
		}
		Set<Integer> set = new TreeSet<>();
		int[] sum = new int[n];
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (s.substring(i, i + 2).equals("AC")) {
				count++;
				set.add(i);
			}
			sum[i] = count;
		}
		sum[n - 1] = count;
		for (int i = 0; i < q; i++) {
			if (set.contains(r[i])) {
				if (set.contains(l[i])) {
					System.out.println(sum[r[i]] - 1 - sum[l[i]] + 1);
				} else {
					System.out.println(sum[r[i]] - 1 - sum[l[i]]);
				}
			} else {
				if (set.contains(l[i])) {
					System.out.println(sum[r[i]] - sum[l[i]] + 1);
				} else {
					System.out.println(sum[r[i]] - sum[l[i]]);
				}
			}
		}
	}
}