// Broken Audio Signal
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			char[] signals = new char[n];
			for (int i = 0; i < signals.length; i++)
				signals[i] = sc.next().charAt(0);
			int max = (int) 1e9;
			int min = (int) -1e9;
			for (int i = 1; i < signals.length - 1; i++) {
				if (signals[i] == 'x')
					if (i % 2 == 1)
						min = Math.max(min, Math.max(signals[i - 1] - '0',
								signals[i + 1] - '0'));
					else
						max = Math.min(max, Math.min(signals[i - 1] - '0',
								signals[i + 1] - '0'));
			}
			if (signals[0] == 'x')
				max = Math.min(max, signals[1] - '0');
			if (signals[signals.length - 1] == 'x')
				if (signals.length % 2 == 1)
					max = Math.min(max, signals[signals.length - 2] - '0');
				else
					min = Math.max(min, signals[signals.length - 2] - '0');
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

	private static boolean isFormatted(char[] signals) {
		for (int i = 0; i < signals.length - 1; i++)
			if (i % 2 == 0 && signals[i] >= signals[i + 1])
				return false;
			else if (i % 2 == 1 && signals[i] <= signals[i + 1])
				return false;
		return true;
	}

	private static boolean containsX(char[] signals) {
		for (char i : signals)
			if (i == 'x')
				return true;
		return false;
	}
}