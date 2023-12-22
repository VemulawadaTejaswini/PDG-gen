import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashMap<Integer, Long> map = new HashMap<>();
		int base = 0;
		map.put(0, 1L);
		for (int i = 0; i < n; i++) {
		    base += sc.nextInt();
		    base %= m;
		    if (map.containsKey(base)) {
		        map.put(base, map.get(base) + 1);
		    } else {
		        map.put(base, 1L);
		    }
		}
		long total = 0;
		for (long x : map.values()) {
		    total += x * (x - 1) / 2;
		}
		System.out.println(total);
    }
}

