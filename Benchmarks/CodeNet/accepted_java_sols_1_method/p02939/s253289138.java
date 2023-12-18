import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();

		ArrayList<String> sa = new ArrayList<String>();

		for (int i = 0; i < len; i++) {
			sa.add(s.substring(i, i + 1));
		}

		for (int i = 0; i < sa.size() - 1; i++) {
			if (sa.get(i).equals(sa.get(i + 1))) {
				if (i < sa.size() - 2) {
					sa.set(i + 1, sa.get(i + 1) + sa.get(i + 2));
					sa.remove(i + 2);
					continue;
				} else {
					sa.set(i, sa.get(i + 1));
					sa.remove(i + 1);
				}
			}
		}
		System.out.println(sa.size());
	}
}