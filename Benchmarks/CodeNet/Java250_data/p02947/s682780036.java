import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Integer> s = new HashMap<>(N);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			char[] c = input.toCharArray();
			Arrays.sort(c);
			String tmp = new String(c);
			if (s.containsKey(tmp)) {
				int v = s.get(tmp) + 1;
				ans += v;
				s.put(tmp, v);
			} else {
				s.put(tmp, 0);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}