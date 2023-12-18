import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int a[] = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
			
			if(map.containsKey(a[i] - 1)) {
				map.put(a[i] - 1, map.get(a[i] - 1) + 1);
			} else {
				map.put(a[i] - 1, 1);
			}
			
			
			if(map.containsKey(a[i] + 1)) {
				map.put(a[i] + 1, map.get(a[i] + 1) + 1);
			} else {
				map.put(a[i] + 1, 1);
			}
		}
		
		int ans = 0;
		for(int key : map.keySet()) {
			ans = Math.max(ans, map.get(key));
		}
		System.out.println(ans);
	}
}
