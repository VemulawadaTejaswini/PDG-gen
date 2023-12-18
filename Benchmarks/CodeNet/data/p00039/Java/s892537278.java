import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0039
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		while (sc.hasNext()) {
			String str = sc.next();
			int cur, prev, res;
			cur = prev = hm.get(str.substring(0, 1));
			res = 0;
			for (int i = 1; i < str.length(); i++) {
				cur = hm.get(str.substring(i, i + 1));
				if (prev < cur) {
					cur -= prev;
				} else {
					res += prev;
				}
				prev = cur;
			}
			res += prev;
			System.out.println(res);
		}
	}
}