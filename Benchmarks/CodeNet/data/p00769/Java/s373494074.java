import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static char[] line;
	static int pos;

	public static void main(String[] args) {
		int N = sc.nextInt();
		for (int i = 0; i < N; ++i) {
			line = sc.next().toCharArray();
			System.out.println(solve());
		}
	}

	static int solve() {
		pos = 0;
		Node root = parse();
		return root.count();
	}

	static Node parse() {
		++pos;
		Node ret = new Node();
		if (line[pos] != '[') {
			ret.num = line[pos++] - '0';
			while (line[pos] != ']') {
				ret.num *= 10;
				ret.num += line[pos] - '0';
				++pos;
			}
			++pos;
			return ret;
		}
		while (line[pos] == '[') {
			ret.child.add(parse());
		}
		++pos;
		return ret;
	}

	static class Node {
		ArrayList<Node> child = new ArrayList<Node>();
		int num;

		int count() {
			if (child.isEmpty()) return num / 2 + 1;
			int[] n = new int[child.size()];
			for (int i = 0; i < child.size(); ++i) {
				n[i] = child.get(i).count();
			}
			Arrays.sort(n);
			int ret = 0;
			for (int i = 0; i <= child.size() / 2; ++i) {
				ret += n[i];
			}
			return ret;
		}
	}

}