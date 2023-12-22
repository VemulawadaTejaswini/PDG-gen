import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Long> map = new HashMap<>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (map.get(a[i]) == null) {
				map.put(a[i], 1L);
			} else {
				map.put(a[i], map.get(a[i]) + 1);
			}
		}
		Map<Integer, Long> res = new HashMap<>();
		Map<Integer, Long> res2 = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (res.get(a[i]) == null) {
				long tmp = map.get(a[i]);
				res.put(a[i], tmp * --tmp / 2);
			}
			if (res2.get(a[i]) == null) {
				long tmp = map.get(a[i]) - 1;
				res2.put(a[i], tmp * --tmp / 2);
			}
		}
		long sum = 0L;
		for (int key : res.keySet()) {
			sum += res.get(key);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(sum - Math.abs(res.get(a[i]) - res2.get(a[i])));
		}
	}
}
