import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		List<String> w = new ArrayList<String>();
		List<String> pre = new ArrayList<String>();
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			w.add(sc.next());
		}

		boolean ok = true;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				pre.add(w.get(i));
				continue;
			}

			String s0 = w.get(i - 1);
			String s1 = w.get(i);

			if (pre.contains(s1)) {
				ok = false;
				break;
			}
			if (s0.charAt(s0.length() - 1) != s1.charAt(0)) {
				ok = false;
				break;
			}

			pre.add(s1);
		}

		if (ok) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}