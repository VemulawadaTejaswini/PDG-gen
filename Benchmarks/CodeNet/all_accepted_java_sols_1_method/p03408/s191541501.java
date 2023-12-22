import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			Integer tmp = smap.get(str);
			if (tmp == null) {
				smap.put(str, 1);
			} else {
				smap.put(str, tmp + 1);
			}
		}

		int m = sc.nextInt();
		HashMap<String, Integer> mmap = new HashMap<String, Integer>();
		for (int i = 0; i < m; i++) {
			String str = sc.next();
			Integer tmp = mmap.get(str);
			if (tmp == null) {
				mmap.put(str, 1);
			} else {
				mmap.put(str, tmp + 1);
			}
		}

		int max = 0;
		for (String key : smap.keySet()) {
			int val1 = smap.get(key);
			Integer val2 = mmap.get(key);
			if(val2 == null) {
				max = Math.max(max, val1);
			} else {
				max = Math.max(max, val1 - val2);
			}
		}

		System.out.println(max);

	}
}