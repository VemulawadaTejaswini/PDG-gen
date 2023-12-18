import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static char[] form;
	static int pos;

	public static void main(String[] args) {
		while (true) {
			String symbol = sc.next();
			if (symbol.length() > 2) break;
			map.put(symbol, sc.nextInt());
		}
		while (true) {
			String line = sc.next();
			if (line.equals("0")) break;
			form = line.toCharArray();
			int ans = solve();
			System.out.println(ans == -1 ? "UNKNOWN" : ans);
		}
	}

	static int solve() {
		pos = 0;
		HashMap<String, Integer> elem = parse();
		int sum = 0;
		for (String symbol : elem.keySet()) {
			if (!map.containsKey(symbol)) return -1;
			sum += elem.get(symbol) * map.get(symbol);
		}
		return sum;
	}

	static HashMap<String, Integer> parse() {
		HashMap<String, Integer> ret = new HashMap<String, Integer>();
		while (pos < form.length) {
			if (form[pos] == '(') {
				++pos;
				HashMap<String, Integer> sub = parse();
				int mul = parseInt();
				for (String symbol : sub.keySet()) {
					int cur = ret.containsKey(symbol) ? ret.get(symbol) : 0;
					ret.put(symbol, cur + sub.get(symbol) * mul);
				}
			} else if (form[pos] == ')') {
				++pos;
				break;
			} else {
				String symbol = "" + form[pos];
				++pos;
				if (pos < form.length) {
					if ('a' <= form[pos] && form[pos] <= 'z') {
						symbol += form[pos];
						++pos;
					}
				}
				int mul = parseInt();
				int cur = ret.containsKey(symbol) ? ret.get(symbol) : 0;
				ret.put(symbol, cur + mul);
			}
		}
		return ret;
	}

	static int parseInt() {
		int ret = 0;
		while (pos < form.length && '0' <= form[pos] && form[pos] <= '9') {
			ret *= 10;
			ret += form[pos] - '0';
			++pos;
		}
		return ret == 0 ? 1 : ret;
	}

}