import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> set = new HashSet<String>();
		String[] kanc = new String[38];
		for (int i = 0; i < 26; i++) {
			kanc[i] = Character.toString((char) ('a' + i));
		}
		// "ld", "mb", "mp", "nc", "nd", "ng", "nt", "nw", "ps", "qu", "cw", and
		// "ts".
		kanc[26] = "ld";
		kanc[27] = "mb";
		kanc[28] = "mp";
		kanc[29] = "nc";
		kanc[30] = "nd";
		kanc[31] = "ng";
		kanc[32] = "nt";
		kanc[33] = "nw";
		kanc[34] = "ps";
		kanc[35] = "qu";
		kanc[36] = "cw";
		kanc[37] = "ts";
		for (int i = 0; i < 38; i++) {
			map.put(kanc[i], i);
		}

		while (sc.hasNext()) {
			int n = sc.nextInt();
			sc.nextLine();
			int[][] count = new int[38][38];
			// count[i][j] : j番目の韓文字の前に出現するi番目の韓文字の数
			while (n != 0) {
				String[] ws = sc.nextLine().split(" ");
				for (int i = 0; i < ws.length; i++) {
					String[] cs = ws[i].split("");
					int k = 0;
					String str = "";
					String pre = "";
					while (true) {
						if (k == cs.length) {
							if (!pre.equals("")&&!str.equals(""))
								count[map.get(pre)][map.get(str)]++;
							break;
						}
						if (map.containsKey(str + cs[k])) {
							str += cs[k];
						} else {
							if (!pre.equals("")) {
								count[map.get(pre)][map.get(str)]++;
							}
							pre = str;
							str = cs[k];
						}
						k++;
					}
				}
				n--;
			}
			for (int i = 0; i < 38; i++) {
				int max = 0;
				int index = 0;
				for (int j = 0; j < 38; j++) {
					if (max < count[i][j]) {
						max = count[i][j];
						index = j;
					}
				}
				String fst = kanc[i];
				String snd = max == 0 ? "a" : kanc[index];
				int thd = max;
				System.out.println(fst + " " + snd + " " + thd);
			}
		}
	}
}