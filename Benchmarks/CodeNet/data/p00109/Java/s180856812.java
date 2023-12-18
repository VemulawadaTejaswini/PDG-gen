
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (;n>0;n--) {
			p = 0;
			line = sc.next();
			System.out.println(formula());
		}
	}
	
	int p; String line;
	char next() {
		return line.charAt(p++);
	}
	
	int formula() {
		return exp();
	}
	
	int exp() {
		int a = term();
		char op = next();
		while (op == '+' || op == '-') {
			int b = term();
			if (op == '+') a += b;
			else a -= b;
			op = next();
		}
		p--;
		return a;
	}
	
	int term() {
		int a = num();
		char op = next();
		while(op == '*' || op == '/') {
			int b = num();
			if (op == '*') a *= b;
			else a /= b;
			op = next();
		}
		p--;
		return a;
	}
	
	int num() {
		char c = next();
		if (c == '(') {
			int num = exp(); p++; return num;
		}
		String num = "";
		while('0' <= c && c <= '9') {
			num += c; c = next();
		}
		p--;
		return Integer.parseInt(num);
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}