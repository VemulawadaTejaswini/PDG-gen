import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			} else {
				map.put(temp, 1);
			}
		}
		boolean b = false;
		if (map.size() == 1) {
			if (map.containsKey(0)) {
				b = true;
			}
		} else if (map.size() == 2 && n % 3 == 0) {
			if (map.containsKey(0) && map.get(0) == n / 3) {
				b = true;
			}

		} else if (map.size() == 3 && n % 3 == 0) {
			int temp = (int)map.keySet().toArray()[0]^(int)map.keySet().toArray()[1]^(int)map.keySet().toArray()[2];
			if(temp == 0) {
				if((int)map.values().toArray()[0] == (int)map.values().toArray()[1] && (int)map.values().toArray()[1] == (int)map.values().toArray()[2]) {
					b=true;
				}
			}
		}
		if(b) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}