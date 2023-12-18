import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // blue card count
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i=0; i<N; i++) {
			String key = sc.next();
			Integer count = map.get(key);
			if ( count == null ) count = 1;
			else count++;
			map.put(key, count);
		}
		int M = sc.nextInt(); // red card count
		for (int i=0; i<M; i++) {
			String key = sc.next();
			Integer count = map.get(key);
			if ( count == null ) count = -1;
			else count--;
			map.put(key, count);
		}
		Iterator<Integer> it = map.values().iterator();
		int res = 0;
		while(it.hasNext()) {
			int t = it.next();
			if (res < t) res = t;
		}
		System.out.println(res);
	}
}
