import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static char[] str;
	static int I, pos;

	public static void main(String[] arg) {
		while (true) {
			str = sc.next().toCharArray();
			I = sc.nextInt();
			if (str[0] == '0') break;
			pos = 0;
			Mid root = parseMid();
			System.out.println(root.ch(I));
		}
	}

	static Mid parseMid() {
		Mid mid = new Mid();
		while (pos < str.length && str[pos] != ')') {
			if (Character.isDigit(str[pos])) {
				int t = parseInt();
				if (str[pos] == '(') {
					++pos;
					Mid c = parseMid();
					++pos;
					c.times = t;
					mid.child.add(c);
				} else {
					char[] cs = new char[t];
					Arrays.fill(cs, str[pos]);
					Leaf c = new Leaf(String.valueOf(cs));
					++pos;
					mid.child.add(c);
				}
			} else {
				Leaf c = parseLeaf();
				mid.child.add(c);
			}
		}
		return mid;
	}

	static Leaf parseLeaf() {
		int start = pos;
		while (pos < str.length && 'A' <= str[pos] && str[pos] <= 'Z') {
			++pos;
		}
		return new Leaf(String.valueOf(str, start, pos - start));
	}

	static int parseInt() {
		int ret = 0;
		while (pos < str.length && Character.isDigit(str[pos])) {
			ret *= 10;
			ret += str[pos] - '0';
			++pos;
		}
		return ret;
	}

	static abstract class Node {
		abstract long length();

		abstract char ch(int pos);
	}

	static class Mid extends Node {
		ArrayList<Node> child = new ArrayList<Node>();
		int times = 1;

		long length() {
			long ret = 0;
			for (Node c : child) {
				ret += c.length();
				if (ret > I) break;
			}
			return Math.min(ret * times, I + 1);
		}

		char ch(int pos) {
			long oneLen = 0;
			for (Node c : child) {
				oneLen += c.length();
			}
			if (pos / oneLen >= this.times) {
				return '0';
			}
			pos %= oneLen;
			long start = 0;
			for (Node c : child) {
				long len = c.length();
				if (pos < start + len) {
					return c.ch((int) (pos - start));
				}
				start += len;
			}
			return '0';
		}
	}

	static class Leaf extends Node {
		String str;

		Leaf(String s) {
			this.str = s;
		}

		long length() {
			return this.str.length();
		}

		char ch(int pos) {
			return this.str.charAt(pos);
		}
	}

}