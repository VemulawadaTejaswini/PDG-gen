import java.util.HashSet;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int len;
	static final int MUL = 31;

	static int solve() {
		String s1 = sc.next();
		String s2 = sc.next();
		long[] mul = new long[4001];
		mul[0] = 1;
		for (int i = 1; i < mul.length; ++i) {
			mul[i] = mul[i - 1] * MUL;
		}
		for (len = Math.min(s1.length(), s2.length()); len >= 1; --len) {
			HashSet<Hash> set = new HashSet<Hash>();
			long hash = 0;
			for (int i = 0; i < len - 1; ++i) {
				hash *= MUL;
				hash += s2.charAt(i) - 'A';
			}
			for (int i = len - 1; i < s2.length(); ++i) {
				hash *= MUL;
				hash += s2.charAt(i) - 'A';
				set.add(new Hash(hash, i - (len - 1), s2));
				hash -= (s2.charAt(i - (len - 1)) - 'A') * mul[len - 1];
			}

			hash = 0;
			for (int i = 0; i < len - 1; ++i) {
				hash *= MUL;
				hash += s1.charAt(i) - 'A';
			}
			for (int i = len - 1; i < s1.length(); ++i) {
				hash *= MUL;
				hash += s1.charAt(i) - 'A';
				if (set.contains(new Hash(hash, i - (len - 1), s1))) {
					return len;
				}
				hash -= (s1.charAt(i - (len - 1)) - 'A') * mul[len - 1];
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		while (sc.hasNext()) {
			System.out.println(solve());
		}
	}

	static class Hash {

		long hash;
		int pos;
		String str;

		Hash(long h, int p, String s) {
			hash = h;
			pos = p;
			str = s;
		}

		public int hashCode() {
			return (int) this.hash;
		}

		public boolean equals(Object obj) {
			Hash o = (Hash) obj;
			if (this.hash != o.hash) return false;
			for (int i = 0; i < len; ++i) {
				if (this.str.charAt(pos + i) != o.str.charAt(o.pos + i)) return false;
			}
			return true;
		}
	}

}