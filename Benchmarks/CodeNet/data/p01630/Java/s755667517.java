import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		char[] val = sc.next().toCharArray();
		BDD bdd = new BDD(N, val);
		while (true) {
			if (!bdd.reduce()) break;
		}
		int ans = 0;
		for (int i = 0; i < N; ++i) {
			ans += bdd.nodes.get(i).size();
		}
		System.out.println(ans);
	}

	static class BDD {
		ArrayList<ArrayList<Node>> nodes = new ArrayList<ArrayList<Node>>();
		Node term0 = new Node();
		Node term1 = new Node();

		BDD(int N, char[] v) {
			for (int i = 0; i < N; ++i) {
				nodes.add(new ArrayList<Node>());
			}
			for (int i = N - 1; i >= 0; --i) {
				for (int j = 0; j < (1 << i); ++j) {
					Node n = new Node();
					if (i == N - 1) {
						n.zero = v[j << 1] == '0' ? term0 : term1;
						n.one = v[(j << 1) + 1] == '0' ? term0 : term1;
					} else {
						n.zero = nodes.get(i + 1).get(j * 2);
						n.one = nodes.get(i + 1).get(j * 2 + 1);
					}
					nodes.get(i).add(n);
				}
			}
		}

		boolean reduce() {
			boolean update = false;
			for (int idx = 0; idx < nodes.size(); ++idx) {
				ArrayList<Node> line = nodes.get(idx);
				ArrayList<Node> replace = new ArrayList<Node>();
				for (int i = 0; i < line.size(); ++i) {
					boolean skip = false;
					Node n = line.get(i);
					if (n.zero.to != null) {
						n.zero = n.zero.to;
						update = true;
					}
					if (n.one.to != null) {
						n.one = n.one.to;
						update = true;
					}
					if (n.zero == n.one) {
						n.to = n.zero;
						update = true;
						skip = true;
						continue;
					}
					for (int j = 0; j < i; ++j) {
						if (line.get(j).zero == n.zero && line.get(j).one == n.one) {
							n.to = line.get(j);
							update = true;
							skip = true;
							break;
						}
					}
					if (!skip) replace.add(n);
				}
				nodes.set(idx, replace);
			}
			return update;
		}
	}

	static class Node {
		Node zero, one, to;
	}

}