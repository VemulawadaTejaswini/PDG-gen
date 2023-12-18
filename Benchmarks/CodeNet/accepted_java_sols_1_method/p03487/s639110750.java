import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
		    int x = sc.nextInt();
		    if (map.containsKey(x)) {
		        map.put(x, map.get(x) + 1);
		    } else {
		        map.put(x, 1);
		    }
		}
		int total = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    int x = entry.getKey();
		    int y = entry.getValue();
		    if (x > y) {
		        total += y;
		    } else {
		        total += y - x;
		    }
		}
       System.out.println(total);
	}
}
