import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final long max = in.nextLong();
		Set<Long> sosuSet = new HashSet<Long>();
		// long pre = 1L;
		// int count = 0;
		boolean isSosu = true;
		for (long val = 2; val <= max; val++) {
			isSosu = true;
			for (Long check : sosuSet) {
				if ((val % check) != 0) {
				} else {
					isSosu = false;
					break;
				}
			}
			if (isSosu) {
				// if ((pre + i) < max) {
				// pre = i;
				sosuSet.add(val);
				// }
				// count++;
			}
		}
		System.out.print(sosuSet.size());
	}
}