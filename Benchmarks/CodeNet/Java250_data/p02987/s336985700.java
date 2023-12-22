import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] A = sc.next().toCharArray();

		Map<Character, Integer> maplst = new TreeMap<Character, Integer>() ;

		for (char c : A) {
			if (maplst.containsKey(c)) {
				maplst.put(c, maplst.get(c) + 1);
			}else {
				maplst.put(c, 1);
			}
		}
		boolean judge = true;
		if (maplst.keySet().size() == 2) {
			for (char c : maplst.keySet()) {
				if (maplst.get(c) != 2) {
					judge = !judge;
					break;
				}
			}
		}else {
			judge = !judge;
		}

		if (judge) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
