// Broken Audio Signal
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			String[] signals = new String[n];
			for (int i = 0; i < signals.length; i++)
				signals[i] = sc.next();
			if (containsDoubleX(signals)) {
				System.out.println("none");
				continue;
			}
			int max = (int) Integer.MAX_VALUE;
			int min = (int) Integer.MIN_VALUE;
			for (int i = 1; i < signals.length - 1; i++) {
				if (signals[i].equals("x"))
					if (i % 2 == 1) {
						min = Math.max(min, parseInt(signals[i - 1]));
						min = Math.max(min, parseInt(signals[i + 1]));
					} else {
						max = Math.min(max, parseInt(signals[i - 1]));
						max = Math.min(max, parseInt(signals[i + 1]));
					}
			}
			if (signals[0].equals("x"))
				max = Math.min(max, parseInt(signals[1]));
			if (signals[signals.length - 1].equals("x"))
				if (signals.length % 2 == 1)
					max = Math.min(max, parseInt(signals[signals.length - 2]));
				else
					min = Math.max(min, parseInt(signals[signals.length - 2]));
			if (containsX(signals))
				if (max - min == 2)
					System.out.println((max + min) / 2);
				else if (max - min > 2)
					System.out.println("ambiguous");
				else
					System.out.println("none");
			else if (isFormatted(signals))
				System.out.println("ambiguous");
			else
				System.out.println("none");
		}
		sc.close();
	}

	private static boolean containsDoubleX(String[] signals) {
		for (int i = 0; i < signals.length - 1; i++) {
			if (signals[i].equals("x") && signals[i + 1].equals("x"))
				return true;
		}
		return false;
	}

	private static boolean isFormatted(String[] signals) {
		for (int i = 0; i < signals.length - 1; i++)
			if (i % 2 == 0 && parseInt(signals[i]) >= parseInt(signals[i + 1]))
				return false;
			else if (i % 2 == 1
					&& parseInt(signals[i]) <= parseInt(signals[i + 1]))
				return false;
		return true;
	}

	private static boolean containsX(String[] signals) {
		for (String str : signals)
			if (str.equals("x"))
				return true;
		return false;
	}
}