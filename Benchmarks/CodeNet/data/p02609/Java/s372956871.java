import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String x = sc.next();
		sc.close();

		for (int i = 1; i <= n; i++) {
			String flipX = flipBinStr(x, i);
			System.out.println(calcFn(Integer.parseInt(flipX, 2)));
		}
	}

	static int popcount(int n) {
		char target = '1';
		int count = 0;
		String nBin = Integer.toBinaryString(n);
		for (char x : nBin.toCharArray()) {
			if (x == target) {
				count++;
			}
		}
		return count;
	}

	static int calcFn(int n) {
		int count = 0;
		while (n != 0) {
			n = n % popcount(n);
			count++;
		}
		return count;
	}

	static String flipBinStr(String x, int i) {
		StringBuilder result = new StringBuilder(x);
		char target = result.charAt(i - 1);
		if (target == '1') {
			result.setCharAt(i - 1, '0');
		} else {
			result.setCharAt(i - 1, '1');
		}
		return result.toString();
	}
}
