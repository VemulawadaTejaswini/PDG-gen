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

		if (xAbs == 0) {
			if (0 == k % 2) {
				result = 0;
			} else {
				result = d;
			}
		} else {
			// xが正の範囲でminになるまで何回引けばよいかチェック
			long count = xAbs / d;
			// 試行回数kよりcountが小さければ、剰余が正のmin
			if (0 == count) {
				// 初手xの負の範囲でのmin
				long minPlus = xAbs % d;
				result = getResult(k, d, count, minPlus);				
			} else if (count < k) {
				// xの正の範囲でのmin
				long minPlus = xAbs % (count * d);
				// 負にいけるかチェック
				result = getResult(k, d, count, minPlus);
			} else {
				// いける範囲まで戻る
				result = xAbs - (d * k);
			}
		}
		System.out.println(result);
	}

	private static long getResult(long k, long d, long count, long minPlus) {
		long result;
		if (count + 1 < k) {
			long minNextPlus = Math.abs(minPlus - d);

			long restK = k - count;
			if (minPlus < minNextPlus) {
				if (0 == restK % 2) {
					result = minPlus;
				} else {
					result = minNextPlus;
				}
			} else {
				result = minNextPlus;
				if (0 == (restK - 1) % 2) {
					result = minNextPlus;
				} else {
					result = minPlus;
				}
			}
		} else {
			result = minPlus;
		}
		return result;
	}

}
