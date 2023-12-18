import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		long k = Long.parseLong(sc.next());
		long d = Long.parseLong(sc.next());
		long result = 0;

		long xAbs = Math.abs(x);
		long count = xAbs / d;
		if (count < k) {
			// xの正の範囲でのmin
			long minPlus = xAbs % (count * d);
			if (count + 1 < k) {
				long minNextPlus = Math.abs(minPlus - d);
				
				if (minPlus == 0) {
					long restK = k - count;
					if (0 == restK%2) {
						result = minPlus;
					} else {
						result = minNextPlus;
					}
				} else if (minPlus < minNextPlus) {
					result = minPlus;
				} else {
					result = minNextPlus;
				}
			} else {
				result = minPlus;
			}
		} else {
			// いける範囲まで戻る
			result = xAbs - (d*k);
		}

		System.out.println(result);
	}

}
