import java.util.Scanner;

public class SmartCalculator {
	static String str;
	static int pos;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			str = sc.next();
			pos = 0;
			System.out.println(expression());
		}
		sc.close();
	}

	static int expression() {
		int ret = term();
		while (pos < str.length()) {
			if (str.charAt(pos) == '+') {
				pos++;
				ret += term();
			} else if (str.charAt(pos) == '-') {
				pos++;
				ret -= term();
			} else {
				break;
			}
		}
		return ret;
	}

	static int term() {
		int ret = factor();
		while (pos < str.length()) {
			if (str.charAt(pos) == '*') {
				pos++;
				ret *= factor();
			} else if (str.charAt(pos) == '/') {
				pos++;
				ret /= term();
			} else {
				break;
			}
		}
		return ret;
	}

	static int factor() {
		if (str.charAt(pos) == '(') {
			pos++;
			return expression();
		} else {
			return number();
		}
	}

	static int number() {
		int ret = 0;
		while (Character.isDigit(str.charAt(pos))) {
			ret *= 10;
			ret += str.charAt(pos) - '0';
			pos++;
		}
		return ret;
	}

}