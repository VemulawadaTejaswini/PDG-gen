import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N;

	static int calc(boolean[] ok, int pos) {
		int ret = 0;
		while (true) {
			while (pos < ok.length && !ok[pos]) {
				pos += 2;
			}
			if (pos >= ok.length) break;
			int prev = pos;
			while (pos < ok.length && ok[pos]) {
				pos += 2;
			}
			ret += Math.max(0, (pos - prev) / 2 - N + 1);
		}
		return ret;
	}

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			sc.nextInt();
			char[] s = sc.next().toCharArray();
			boolean[] ok = new boolean[s.length];
			for (int i = 1; i < s.length - 1; ++i) {
				ok[i] = s[i] == 'O' && s[i - 1] == 'I' && s[i + 1] == 'I';
			}
			System.out.println(calc(ok, 1) + calc(ok, 2));
		}
	}
}