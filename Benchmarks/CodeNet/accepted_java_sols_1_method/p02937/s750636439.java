import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String s = in.readLine();
		String t = in.readLine();
		String S = s + s;

		Map<Character, List<Integer>> sMap = new HashMap<>();
		for (int i = 0; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (!sMap.containsKey(c)) {
				sMap.put(c, new ArrayList<>());
			}
			sMap.get(c).add(i);
		}

		// まず可能かどうかを判別
		for (int i = 0; i < t.length(); ++i) {
			if (!sMap.containsKey(t.charAt(i))) {
				System.out.println("-1");
				return;
			}
		}

		long loop = 0L;
		int mod = 0;
		for (int i = 0; i < t.length(); ++i) {
			char c = t.charAt(i);
			List<Integer> list = sMap.get(c);
			int index = Collections.binarySearch(list, mod);
			// System.out.println(c + ", " + index + ", " + mod);
			if (index >= 0) {
				// list[index] - modの分だけ文字列長くなる
				mod += list.get(index) - mod;
			} else {
				// 挿入する部分のindexを求める
				index = (index + 1) * -1;
				// list[index]-modの分だけ文字列長くなる
				mod += list.get(index) - mod;
			}
			++mod;
			if (mod >= s.length()) {
				loop += mod / s.length();
				mod %= s.length();
			}
		}
		long length = (long) (s.length()) * loop + (long) mod;
		System.out.println((length));

	}
}
