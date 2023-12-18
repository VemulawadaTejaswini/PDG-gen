import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	String exp;
	int pos = 0;
	static int ANSWER_CAP = 1000000007;

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		exp = sc.nextLine();
		Pair pair = expression();
		System.out.println(pair._true);
		sc.close();
	}

	Pair expression() {
		List<Pair> list = new ArrayList<Pair>();
		list.add(term());
		while (pos < exp.length() && exp.charAt(pos) == '|') {
			pos++;
			list.add(term());
		}
		int all = 1;
		int fal = 1;
		for (Pair pair : list) {
			all *= pair._true + pair._false;
			all %= ANSWER_CAP;
			fal *= pair._false;
		}
		return new Pair((all - fal + ANSWER_CAP) % ANSWER_CAP, fal);
	}

	Pair term() {
		List<Pair> list = new ArrayList<Pair>();
		list.add(factor());
		while (pos < exp.length() && exp.charAt(pos) == '&') {
			pos++;
			list.add(factor());
		}
		int all = 1;
		int tru = 1;
		for (Pair pair : list) {
			all *= pair._true + pair._false;
			all %= ANSWER_CAP;
			tru *= pair._true;
		}
		return new Pair(tru, (all - tru + ANSWER_CAP) % ANSWER_CAP);
	}

	Pair factor() {
		char c = exp.charAt(pos++);
		if (c == '~') {
			Pair pair = factor();
			return new Pair(pair._false, pair._true);
		} else if (c == '(') {
			Pair pair = expression();
			pos++;
			return pair;
		}
		number();
		return new Pair(1, 1);
	}

	void number() {
		while (Character.isDigit(exp.charAt(pos))) {
			pos++;
		}
	}
}

class Pair {
	int _true;
	int _false;

	Pair(int t, int f) {
		_true = t;
		_false = f;
	}
}