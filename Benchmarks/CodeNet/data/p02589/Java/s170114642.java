import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] s = new char[n][];
		for (int i = 0; i < n; i++) {
			s[i] = new StringBuilder(br.readLine()).reverse().toString().toCharArray();
		}
		br.close();

		int[][] num = new int[n][];
		List<Node> trie = new ArrayList<>();
		trie.add(new Node(' '));
		for (int i = 0; i < n; i++) {
			num[i] = new int[s[i].length];
			int idx = 0;
			for (int j = 0; j < s[i].length; j++) {
				num[i][j] = idx;
				char c = s[i][j];
				Node o = trie.get(idx);
				idx = o.next.getOrDefault(c, 0);
				if (idx == 0) {
					idx = trie.size();
					o.next.put(c, idx);
					trie.add(new Node(c));
				}
			}
			trie.get(idx).end = true;
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			Set<Character> set = new HashSet<>();
			for (int j = s[i].length - 1; j >= 0; j--) {
				set.add(s[i][j]);
				Map<Character, Integer> map = trie.get(num[i][j]).next;
				for (char c : set) {
					int idx = map.getOrDefault(c, 0);
					if (trie.get(idx).end) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans - n);
	}

	static class Node {
		char c;
		Map<Character, Integer> next = new HashMap<>();
		boolean end;

		public Node(char c) {
			this.c = c;
		}
	}
}
