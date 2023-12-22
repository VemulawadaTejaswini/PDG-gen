

import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(s, s);

		int ans = 2;
		while (true) {
			if (s % 2 == 0)
				s = s / 2;
			else
				s = 3 * s + 1;
			if (map.containsKey(s)) {
				break;
			}
			map.put(s, s);
			ans++;
		}

		System.out.println(ans);
	}

}
