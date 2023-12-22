import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();

		Map<String, Long> s = new HashMap<>();
		for (int i = 0; i < n; i++) {
			char[] cs = sc.nextLine().toCharArray();
			Arrays.sort(cs);
			String string = new String(cs);
			s.put(string, s.getOrDefault(string, 0L) + 1L);
		}

		long answer = 0;
		for (String k : s.keySet()) {
			answer += s.get(k) * (s.get(k) - 1) / 2;
		}
		System.out.println(answer);
	}
}
