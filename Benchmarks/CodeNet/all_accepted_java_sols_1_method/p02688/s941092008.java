

import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int a = 0;

		for (int i = 0; i < k; i++) {
			int d = sc.nextInt();
			for (int j = 0; j < d; j++) {
				a = sc.nextInt();
				if (!map.containsKey(a))
					map.put(a, a);
			}
		}
		System.out.println(n - map.size());
	}

}
