
import java.util.Scanner;

public class Main {
	static int APoints = 0;
	static int BPoints = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String strA;
		String strB;

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			strA = sc.next();
			strB = sc.next();
			calcPoints(strA, strB);
		}
		System.out.println(APoints + " " + BPoints);

	}

	static void calcPoints(String strA, String strB) {
		boolean isBiggerA = false;
		boolean isBiggerB = false;
		boolean isEqual = false;
		int length;
		if (strA.length() > strB.length()) {
			length = strB.length();
		} else {
			length = strA.length();
		}
		for (int i = 0; i < length; i++) {
			if (strA.charAt(i) > strB.charAt(i)) {
				isBiggerA = true;
				break;
			} else if (strA.charAt(i) < strB.charAt(i)) {
				isBiggerB = true;
				break;
			}

		}
		if ((isBiggerA == false) && (isBiggerB == false)) {
			if (strA.length() > strB.length()) {
				isBiggerA = true;
			} else if (strA.length() < strB.length()) {
				isBiggerB = true;
			} else {
				isEqual = true;
			}
		}

		if (isBiggerA) {
			APoints += 3;
		} else if (isBiggerB) {
			BPoints += 3;
		} else if (isEqual) {
			APoints++;
			BPoints++;
		}
	}
}