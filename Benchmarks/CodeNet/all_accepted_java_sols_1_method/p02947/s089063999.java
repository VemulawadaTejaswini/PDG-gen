import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    char[] arr = sc.next().toCharArray();
		    Arrays.sort(arr);
		    String s = new String(arr);
		    if (map.containsKey(s)) {
		        map.put(s, map.get(s) + 1);
		    } else {
		        map.put(s, 1);
		    }
		}
		long total = 0;
		for (int x : map.values()) {
		    total += (long) x * (x - 1) / 2;
		}
		System.out.println(total);
	}
}
