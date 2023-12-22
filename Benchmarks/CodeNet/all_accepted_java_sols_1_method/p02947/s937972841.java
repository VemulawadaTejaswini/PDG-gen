import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		HashMap<String, Integer> hm = new HashMap<>();
		char[] s;
		Integer[] az;
		String tmp;
		for (int i = 0; i < n; i++) {
			s = sc.next().toCharArray();
			Arrays.sort(s);
			tmp = "";
			for (int j = 0; j < s.length; j++) {
				tmp += s[j];
			}
			if (hm.containsKey(tmp)) {
				hm.put(tmp, hm.get(tmp) + 1);
			} else {
				hm.put(tmp, 1);
			}
		}
		long sum = 0;
		for (String str : hm.keySet()) {
			sum += (long) hm.get(str) * (hm.get(str) - 1) / 2;
		}
		System.out.println(sum);
	}
}
