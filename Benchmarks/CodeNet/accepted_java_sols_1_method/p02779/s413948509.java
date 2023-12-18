import java.io.*;
import java.util.*;

class Main {
	static final String YES = "YES";
	static final String NO = "NO";

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		Set<Long> s = new HashSet<>();
		for (int i = 0; i < N; i++) {
			Long a = sc.nextLong();
			if (s.contains(a)) {
				System.out.println(NO);
				return;
			}
			s.add(a);
		}
		System.out.println(YES);
	}
}
