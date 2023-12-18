import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String[] S = new String[(int) N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		Map<String, Long> m = new HashMap<String, Long>();
		m.put("AC", 0L);
		m.put("WA", 0L);
		m.put("TLE", 0L);
		m.put("RE", 0L);
		for (int i = 0; i < S.length; i++) {
			m.put(S[i], m.get(S[i]) + 1);
		}
		System.out.printf("AC x %d%n", m.get("AC"));
		System.out.printf("WA x %d%n", m.get("WA"));
		System.out.printf("TLE x %d%n", m.get("TLE"));
		System.out.printf("RE x %d%n", m.get("RE"));
	}
}
