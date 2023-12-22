import java.util.Scanner;

class Main {
	String s;
	String[] d = { "maerd", "remaerd", "esare", "resare" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main m = new Main(sc);
		m.solve();
		sc.close();
	}

	Main(Scanner sc) {
		s = sc.next();
	}

	void solve() {
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		first: while (sb.length() >= 5) {
			for (int i = 0; i < 4; i++) {
				if (d[i].length() <= sb.length()) {
					if (d[i].equals(sb.substring(0, d[i].length()))) {
						sb.delete(0, d[i].length());
						break;
					}
				}
				if (i == 3) {
					break first;
				}
			}
		}
		if (sb.length() == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}