import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	private static final String[][] KEYWORDS = {
			{ "the", "uif", "vjg", "wkh", "xli", "ymj", "znk", "aol", "bpm", "cqn", "dro", "esp", "ftq", "gur", "hvs",
					"iwt", "jxu", "kyv", "lzw", "max", "nby", "ocz", "pda", "qeb", "rfc", "sgd" },
			{ "this", "uijt", "vjku", "wklv", "xlmw", "ymnx", "znoy", "aopz", "bpqa", "cqrb", "drsc", "estd", "ftue",
					"guvf", "hvwg", "iwxh", "jxyi", "kyzj", "lzak", "mabl", "nbcm", "ocdn", "pdeo", "qefp", "rfgq",
					"sghr" },
			{ "that", "uibu", "vjcv", "wkdw", "xlex", "ymfy", "zngz", "aoha", "bpib", "cqjc", "drkd", "esle", "ftmf",
					"gung", "hvoh", "iwpi", "jxqj", "kyrk", "lzsl", "matm", "nbun", "ocvo", "pdwp", "qexq", "rfyr",
					"sgzs" } };

	public static void main(String[] a) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			READ_LOOP: while ((line = br.readLine()) != null) {
				for (int i = 0; i < KEYWORDS.length; i++) {
					for (int j = 0; j < KEYWORDS[i].length; j++) {
						if (line.indexOf(KEYWORDS[i][j]) != -1) {
							char[] cs = line.toCharArray();

							for (int k = 0; k < cs.length; k++) {
								char ch = cs[k];
								if (ch != ' ' && ch != '.') {
									cs[k] = (char) ((ch - 'a' + 26 - j) % 26 + 'a');
								}
							}

							System.out.println(cs);

							continue READ_LOOP;
						}
					}
				}
			}
		} catch (Exception e) {
		}
	}
}