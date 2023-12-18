import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		final String s = sc.next();

		int maxMachCount = 0;

		for (int i = 0; i < n; i++) {
			final String sLSubstr = s.substring(0, i + 1);
			final String sLeft[] = sLSubstr.split("");

			if (n < i + 1) {
				break;
			}

			final String sRSubstr = s.substring(i + 1);
			final String sRight[] = sRSubstr.split("");

			List<String> left = new ArrayList<String>();
			for (final String l : sLeft) {
				left.add(l);
			}
			List<String> right = new ArrayList<String>();
			for (final String r : sRight) {
				right.add(r);
			}

			final List<String> left2 = new ArrayList<String>(new LinkedHashSet<>(left));
			final List<String> right2 = new ArrayList<String>(new LinkedHashSet<>(right));

			int machCount = 0;
			for (final String l2 : left2) {
				if (right2.contains(l2)) {
					machCount++;
				}
			}
			if (maxMachCount < machCount) {
				maxMachCount = machCount;
			}

		}

		System.out.println(maxMachCount);

	}

}