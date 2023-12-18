

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		int black = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				black = j * (n - 2 * i) + i * m;
				if (!map.containsKey(black))
					map.put(black, black);
			}
		}

		if (map.containsKey(k))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
