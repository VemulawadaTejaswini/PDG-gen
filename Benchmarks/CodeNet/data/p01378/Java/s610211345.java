import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * [[iwi]]
 */
public class Main {

	static final String UNIQ = "iwi";
	static final char[][] PAIRS = new char[][]{
			{'w', 'w'},
			{'i', 'i'},
			{'(', ')'},
			{')', '('},
			{'{', '}'},
			{'}', '{'},
			{'[', ']'},
			{']', '['},
	};

	static Map<Character, List<int[]>> sym;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		Map<Character, List<Integer>> pos = new HashMap<>();
		sym = new HashMap<>();

		line = br.readLine();

		for (int i = 0; i < line.length(); i++) {
			pos.putIfAbsent(line.charAt(i), new ArrayList<>());
			pos.get(line.charAt(i)).add(i);
		}

		for (char[] key : PAIRS) {
			if (pos.containsKey(key[0]) && pos.containsKey(key[1])) {
				for (int i : pos.get(key[0])) {
					for (int j : pos.get(key[1])) {
						if (key[0] == 'w') {
							if (i <= j) {
								sym.putIfAbsent(key[0], new ArrayList<>());
								sym.get(key[0]).add(new int[]{i, j});
							}
						} else if (key[0] == 'i') {
							if (i < j - 1) {
								sym.putIfAbsent(key[0], new ArrayList<>());
								sym.get(key[0]).add(new int[]{i, j});
							}
						} else {
							if (i < j - 3) {
								sym.putIfAbsent(key[0], new ArrayList<>());
								sym.get(key[0]).add(new int[]{i, j});
							}
						}
					}
				}
			}
		}

		int max = 0;

		for (int[] posw : sym.get('w')) {
			if (posw[0] == posw[1]) {
				for (int[] posi : sym.get('i')) {
					if (posi[0] < posw[0] && posw[1] < posi[1]) {
						max = Math.max(max, solve(posi[0], posi[1], "iwi"));
					}
				}
			}
		}

		System.out.println(max);

	}//end main

	static int solve(int s, int t, String handle) {

		//System.out.println(handle);

		if (handle.indexOf(UNIQ) != handle.lastIndexOf(UNIQ)) return 0;

		int ret = handle.length();

		for (char[] key : PAIRS) {
			if (sym.containsKey(key[0])) {
				for (int[] pos : sym.get(key[0])) {
					if (pos[0] < s && t < pos[1]) {
						ret = Math.max(ret, solve(pos[0], pos[1], key[0] + handle + key[1]));
					}
				}
			}
		}

		return ret;
	}
}