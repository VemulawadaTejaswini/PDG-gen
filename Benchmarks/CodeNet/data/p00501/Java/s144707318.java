import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	static boolean ok(String name, String src) {
		if (src.indexOf(name) >= 0) return true;
		for (int i = 2; i < src.length(); ++i) {
			for (int j = 0; j < i; ++j) {
				StringBuilder sb = new StringBuilder();
				int pos = j;
				while (pos < src.length()) {
					sb.append(src.charAt(pos));
					pos += i;
				}
				if (sb.indexOf(name) >= 0) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int N = sc.nextInt();
		String name = sc.next();
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			if (ok(name, sc.next())) ++ans;
		}
		System.out.println(ans);
	}

}