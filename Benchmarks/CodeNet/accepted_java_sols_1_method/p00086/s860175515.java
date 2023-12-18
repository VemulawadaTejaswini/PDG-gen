import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int v1, v2;
		int n;
		HashMap<Integer, Integer> map;
		boolean flag;

		while (sc.hasNext()) {
			map  = new HashMap<Integer, Integer>();
			flag = true;
			n = 0;
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			while (v1 + v2 != 0) {
				if (map.get(v1) == null) {
					map.put(v1, 1);
					n++;
				} else {
					map.put(v1, map.get(v1) + 1);
				}
				if (map.get(v2) == null) {
					map.put(v2, 1);
					n++;
				} else {
					map.put(v2, map.get(v2) + 1);
				}

				v1 = sc.nextInt();
				v2 = sc.nextInt();
			}
			if (map.get(1) % 2 != 1 || map.get(2) % 2 != 1) {
				flag = false;
			}
			for (int i = 3; i <= n; i++) {
				if (map.get(i) % 2 != 0) {
					flag = false;
				}
			}

			System.out.println(flag ? "OK" : "NG");
		}
	}
}