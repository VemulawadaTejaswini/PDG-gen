import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] c = s.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < c.length; i++) {
			if (c[i] == '0') {
				al.add('0');
			} else if (c[i] == '1') {
				al.add('1');
			} else if (c[i] == 'B' && al.size() != 0) {
				al.remove(al.size() - 1);
			}
		}

		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i));
		}
	}
}