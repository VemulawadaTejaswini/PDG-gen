import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	TreeSet<String> set;

	void catAndAdd(String a, String b) {
		String s = "" + a + b;
		set.add(s);
	}

	void run() {
		Scanner sc = new Scanner(System.in);

		for (int T = sc.nextInt() - 1; 0 <= T; T--) {
			StringBuilder s = new StringBuilder(sc.next());

			set = new TreeSet<String>();
			for (int i = 1; i < s.length(); i++) {
				String a = s.substring(0, i);
				String aRev = new StringBuilder(a).reverse().toString();
				String b = s.substring(i, s.length());
				String bRev = new StringBuilder(b).reverse().toString();

				catAndAdd(a, b);
				catAndAdd(aRev, b);
				catAndAdd(a, bRev);

				catAndAdd(b, a);
				catAndAdd(bRev, a);
				catAndAdd(b, aRev);
				
				catAndAdd(aRev, bRev);
			}

			System.out.println(set.size());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}