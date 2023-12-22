import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		String s = sc.next();
		int z = 0, o = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("0")) {
				z++;
			} else {
				o++;
			}
		}

		System.out.println((2 * Math.min(z, o)));

		sc.close();
	}
}
