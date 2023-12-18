

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> M = new HashMap<>();

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			int p = sc.nextInt();
			if (p == 0) {
				String key = sc.next();
				int x = sc.nextInt();
				M.put(key, x);
			} else if (p == 1) {
				String key = sc.next();
				if (M.get(key) == null) {
					System.out.println("0");
				} else {
					System.out.println(M.get(key));
				}
			} else if (p == 2) {
				String key = sc.next();
				M.remove(key);
			}
		}

		sc.close();

	}

}

