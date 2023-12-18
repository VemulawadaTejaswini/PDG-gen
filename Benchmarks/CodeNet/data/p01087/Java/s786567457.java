import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * ICPC Calculator
 */
public class Main {

	static final char NOOP = ' ';
	static final char PLUS = '+';
	static final char MULTI = '*';

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Main main = new Main();

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n = parseInt(line);
			if (n == 0) break;

			Exp exp = main.new Exp(null, -1, PLUS);
			Exp parent = exp;

			for (int i = 0; i < n; i++) {
				line = br.readLine();

				int lv = 0;
				for (char c : line.toCharArray()) {
					if (c == '.') {
						lv++;
					} else {
						while (parent.lv >= lv) {
							parent = parent.parent;
						}
						Exp sub = main.new Exp(parent, lv, c);
						parent.exps.add(sub);
						if (c == PLUS || c == MULTI) parent = sub;
					}
				}
			}
			System.out.println(exp.value());
		} //end while
	} //end main

	class Exp {
		int lv;
		char op;
		int value;
		//
		Exp parent;
		List<Exp> exps;

		Exp(Exp parent, int lv, char c) {
			this.parent = parent;
			this.lv = lv;
			if (c != PLUS && c != MULTI) {
				this.op = NOOP;
				this.value = c - '0';
			} else {
				this.op = c;
				exps = new ArrayList<Exp>();
			}
		}

		int value() {
			if (op == PLUS) {
				value = 0;
				for (Exp exp : exps) value += exp.value();
			} else if (op == MULTI) {
				value = 1;
				for (Exp exp : exps) value *= exp.value();
			}
			return value;
		}
	}
}