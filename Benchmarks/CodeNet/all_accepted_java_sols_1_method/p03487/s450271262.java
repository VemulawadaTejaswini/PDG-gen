import java.util.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (map.get(a) == null) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
		}

		int cnt = 0;
		for (int k : map.keySet()) {
			int v = map.get(k);
			if (k < v) {
				cnt += (v - k);
			} else if (k > v) {
				cnt += v;
			}
		}

		System.out.println(cnt);
	}
}
