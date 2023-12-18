import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Integer.parseInt;

/**
 * Substring
 */
public class Main {

	static Main main = new Main();
	static char[] s;
	static final String Li = "L++";
	static final String Ld = "L--";
	static final String Ri = "R++";
	static final String Rd = "R--";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();
		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		Trie root = main.new Trie();
		int count = 0;

		s = br.readLine().toCharArray();
		int l = 0, r = 1;

		//parse
		for (int i = 0; i < m; i++) {
			switch (br.readLine()) {
				case Li:
					l++;
					break;
				case Ld:
					l--;
					break;
				case Ri:
					r++;
					break;
				case Rd:
					r--;
					break;
			}

			int k = r - l;
			Trie node = root;
			for (int j = 0; j < k; j++) {
				char c = s[l + j];
				node.edges.putIfAbsent(c, main.new Trie());
				node = node.edges.get(c);
				if (j == k - 1 && !node.wordEnd) {
					node.wordEnd = true;
					count++;
				}
			}
		}
		System.out.println(count);
	}

	class Trie {
		boolean wordEnd = false;
		Map<Character, Trie> edges;

		Trie() {
			edges = new HashMap<>();
		}
	}

}