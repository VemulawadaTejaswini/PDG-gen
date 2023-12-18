import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int N;
	static char[][] operand;
	static char[] ans;
	static int[] c2i = new int[26];
	static boolean[] used = new boolean[10];

	public static void main(String[] args) {
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			operand = new char[N - 1][];
			for (int i = 0; i < N - 1; ++i) {
				operand[i] = rev(sc.next());
			}
			ans = rev(sc.next());
			System.out.println(solve());
		}
	}

	static int solve() {
		for (int i = 0; i < N - 1; ++i) {
			if (operand[i].length > ans.length) return 0;
		}
		Arrays.fill(c2i, -1);
		Arrays.fill(used, false);
		return rec(0, 0, 0);
	}

	static int rec(int digits, int pos, int sum) {
		if (pos == operand.length) {
			int cur = c2i[ans[digits] - 'A'];
			if (cur != -1) {
				if (sum % 10 != cur) return 0;
			} else {
				if (used[sum % 10]) return 0;
			}
			if (digits == ans.length - 1) {
				return 0 < sum && sum < 10 ? 1 : 0;
			}
			if (cur == -1) {
				c2i[ans[digits] - 'A'] = sum % 10;
				used[sum % 10] = true;
			}
			int ret = rec(digits + 1, 0, sum / 10);
			if (cur == -1) {
				c2i[ans[digits] - 'A'] = -1;
				used[sum % 10] = false;
			}
			return ret;
		}
		if (digits >= operand[pos].length) return rec(digits, pos + 1, sum);
		int cur = c2i[operand[pos][digits] - 'A'];
		if (cur == -1) {
			int ret = 0;
			for (int i = 0; i < 10; ++i) {
				if (used[i]) continue;
				if (digits > 0 && i == 0 && digits == operand[pos].length - 1) continue;
				used[i] = true;
				c2i[operand[pos][digits] - 'A'] = i;
				ret += rec(digits, pos + 1, sum + i);
				used[i] = false;
				c2i[operand[pos][digits] - 'A'] = -1;
			}
			return ret;
		} else {
			if (cur == 0 && digits == operand[pos].length - 1) return 0;
			return rec(digits, pos + 1, sum + cur);
		}
	}

	static char[] rev(String s) {
		char[] ret = new char[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			ret[i] = s.charAt(s.length() - 1 - i);
		}
		return ret;
	}

}