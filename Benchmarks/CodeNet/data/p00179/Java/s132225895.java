import java.util.*;

public class Main {

	public static boolean isEnd (String str) {
		boolean f = true;
		for (int i = 1; i < str.length(); i++)
			f &= str.charAt(i - 1) == str.charAt(i);
		return f;
	}

	public static char getColor (char a, char b) {

		if ((a == 'r' && b == 'g') || a == 'g' && b == 'r') return 'b';
		if ((a == 'r' && b == 'b') || a == 'b' && b == 'r') return 'g';
		return 'r';

	}

	public static String bfs (String str) {

		if (isEnd(str)) return "0";

		ArrayList<String> pattern = new ArrayList<String>();
		Set<String> memo = new HashSet<String>();

		int step = 1;

		pattern.add(str);
		memo.add(str);

		while (!pattern.isEmpty()) {

			ArrayList<String> next = new ArrayList<String>();
			for (String p : pattern) {
				for (int i = 1; i < p.length(); i++) {
					if (p.charAt(i - 1) != p.charAt(i)) {
						char[] c = p.toCharArray();
						char rep = getColor(p.charAt(i - 1), p.charAt(i));
						c[i - 1] = (c[i] = rep);
						if (isEnd(new String(c))) return "" + step;
						if (!memo.contains(new String(c))) {
							memo.add(new String(c));
							next.add(new String(c));
						}
					}
				}

			}

			step++;
			pattern = next;
		}

		return "NA";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String str = sc.nextLine();
			if (str.equals("0")) break;
			System.out.println(bfs(str));

		}

	}

}