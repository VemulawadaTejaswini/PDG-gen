import java.util.Scanner;
import java.util.LinkedHashMap;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			LinkedHashMap<Integer, Long> hm = new LinkedHashMap<Integer, Long>();
			for (int i = 0; i < n; i++) {
				int id = sc.nextInt();
				long a = sc.nextInt();
				long b = sc.nextInt();
				if (hm.containsKey(id)) {
					long c = hm.get(id) + (a * b);
					hm.put(id, c);
				} else {
					hm.put(id, a * b);
				}
			}
			boolean bl = false;
			for (Integer key: hm.keySet()) {
				if (hm.get(key) >= 1000000) {
					bl = true;
					System.out.println(key);
				}
			}
			if (bl == false) {
				System.out.println("NA");
			}
			n = sc.nextInt();
		}
	}
}
