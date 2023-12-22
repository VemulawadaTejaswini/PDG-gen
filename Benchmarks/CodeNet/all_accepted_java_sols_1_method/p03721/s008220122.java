import java.nio.charset.IllegalCharsetNameException;
import java.util.*;
import java.lang.*;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] a = new int[n];
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		Map<Integer, Long> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + b[i]);
			} else {
				map.put(a[i], (long)b[i]);
			}
		}
		for (int i = 1; i <= 100000; i++) {
			if (map.containsKey(i)) {
				k -= map.get(i);
			}
			if (k <= 0) {
				System.out.println(i);
				break;
			}
		}
	}
}