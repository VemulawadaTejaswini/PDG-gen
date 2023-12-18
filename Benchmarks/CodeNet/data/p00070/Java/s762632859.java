import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
	createMap(0, null, new boolean[10], 0);
	Scanner in = new Scanner(System.in);
	boolean endflag = false;
	while (!endflag && in.hasNext()) {
	 int n = in.nextInt();
	 int s = in.nextInt();
	 if (n != 0 || s != 0) {
		Integer ans = valMap
		  .get(Integer.valueOf(n))
		  .get(Integer.valueOf(s));
		if (ans == null) {
		 ans = Integer.valueOf(0);
		}
		System.out.println(
		  ans);
	 } else {
		endflag = true;
	 }
	}
 }

 static Map<Integer, Map<Integer, Integer>> valMap = new HashMap<Integer, Map<Integer, Integer>>();
 static {
	for (int i = 1; i <= 10; i++) {
	 valMap.put(Integer.valueOf(i),
		 new HashMap<Integer, Integer>());
	}
 }

 private static void
	 createMap(Integer n, Map<Integer, Integer> map,
	   boolean[] used, Integer s) {
	if (map != null) {
	 int val = 1;
	 if (map.containsKey(s)) {
		val += map.get(s);
	 }
	 map.put(s, val);
	}
	for (int i = 0; i < 10; i++) {
	 if (!used[i]) {
		used[i] = true;
		createMap(n + 1, valMap.get(n + 1), used,
		  s + i * (n + 1));
		used[i] = false;
	 }
	}
 }
}