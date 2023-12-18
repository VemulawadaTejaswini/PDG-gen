import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		for (int i=0; i<n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		Map<String, Integer> map = new HashMap<>();
		for (int i=0; i<s.length; i++) {
			char[] c = s[i].toCharArray();
			Arrays.sort(c);
			String key = String.valueOf(c);
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		long cnt = 0;
		for (Integer v : map.values()) {
			if (v == 1) continue;
			long t = (long)v;
			cnt += (t*t - t) / 2;
		}

		System.out.println(cnt);
	}

}