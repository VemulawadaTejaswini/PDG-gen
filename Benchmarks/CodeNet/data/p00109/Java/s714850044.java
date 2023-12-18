import java.util.*;
import java.lang.*;

public class Main {
	static String s;
	static int now;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			s = sc.next();
			now = 0;
			System.out.println(expression());
		}
	}
	static int expression() {
		int ret = term();
		while (true) {
			if (s.charAt(now) == '+') {
				now++;
				ret += term();
			} else if (s.charAt(now) == '-') {
				now++;
				ret -= term();
			} else {
				break;
			}
		}
		return ret;
	}
	static int term() {
		int ret = factor();
		while (true) {
			if (s.charAt(now) == '*') {
				now++;
				ret *= factor();
			} else if (s.charAt(now) == '/') {
				now++;
				ret /= factor();
			} else {
				break;
			}
		}
		return ret;
	}
	static int factor() {
		if (s.charAt(now) == '(') {
			now++;
			int ret = expression();
			now++;
			return ret;
		} else {
			return number();
		}
	}
	static int number() {
		int ret = 0;
		while (Character.isDigit(s.charAt(now))) {
			ret *= 10;
			ret += s.charAt(now) - '0';
			now++;
		}
		return ret;
	}
}


