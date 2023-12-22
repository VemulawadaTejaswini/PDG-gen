import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long N = Long.parseLong(sc.next());
			long temp = 0L;
			int ret = 10;
			// Set<Long> s = new HashSet<>();
			for(long i = 1L; i <= 100000; i++) {
				if(!(N % i == 0)) {
					continue;
				}
				// System.out.println("F(" + (N /i) + ", " + i + ")");
				temp = Math.max(N /i, i);
				// if(!s.add(temp)) break;
				ret = Math.min(ret, String.valueOf(temp).length());
			}
			System.out.println(ret);
		} // Scanner Close
	}
}