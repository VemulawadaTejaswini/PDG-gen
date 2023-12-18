import java.util.Scanner;

public class Main {
	char[] c;
	int id;

	int expression() {
		int res = term();
		while (c[id] == '+' || c[id] == '-') {
			if (c[id] == '+') {
				id++;
				res += term();
			} else {
				id++;
				res -= term();
			}
		}
		return res;
	}

	int term() {
		int res = fact();
		while (c[id] == '*' || c[id] == '/') {
			if (c[id] == '*') {
				id++;
				res *= fact();
			} else {
				id++;
				res /= fact();
			}
		}
		return res;
	}

	int fact() {
		int res = 0;
		if (c[id] == '(') {
			id++;
			res = expression();
			id++;
		} else if (c[id] == '+') {
			id++;
			res = fact();
		} else if (c[id] == '-') {
			id++;
			res = -fact();
		} else {
			res = number();
		}
		return res;
	}

	int number() {
		int res = 0;
		while ('0' <= c[id] && c[id] <= '9') {
			res *= 10;
			res += c[id] - '0';
			id++;
		}
		return res;
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			c = sc.next().toCharArray();
			id = 0;
			System.out.println(expression());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}