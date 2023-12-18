import java.util.*;
public class Main {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner sc = new Scanner(System.in);
		int n;

		n = sc.nextInt();
		while(n != 0) {
			map.clear();
			for(int i = 0; i < n; i++) {
				int nn = sc.nextInt();
				if (map.containsKey(nn)) {
					map.put(nn, map.get(nn) + 1);
				} else {
					map.put(nn, 1);
				}
			}
			
			boolean flag = false;
			int ans = 0;
			for(int id : map.keySet()) {
				if (map.get(id) > n / 2) {
					ans = id;
					flag = true;
					break;
				}
			}
			
			if (flag) {
				System.out.println(ans);
			} else {
				System.out.println("NO COLOR");
			}
			
			n = sc.nextInt();
		}
	}
}