import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	WordTbl			wt = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
		wt = new WordTbl();

		wt.put(11, 'a');
		wt.put(12, 'b');
		wt.put(13, 'c');
		wt.put(14, 'd');
		wt.put(15, 'e');
		wt.put(21, 'f');
		wt.put(22, 'g');
		wt.put(23, 'h');
		wt.put(24, 'i');
		wt.put(25, 'j');
		wt.put(31, 'k');
		wt.put(32, 'l');
		wt.put(33, 'm');
		wt.put(34, 'n');
		wt.put(35, 'o');
		wt.put(41, 'p');
		wt.put(42, 'q');
		wt.put(43, 'r');
		wt.put(44, 's');
		wt.put(45, 't');
		wt.put(51, 'u');
		wt.put(52, 'v');
		wt.put(53, 'w');
		wt.put(54, 'x');
		wt.put(55, 'y');
		wt.put(61, 'z');
		wt.put(62, '.');
		wt.put(63, '?');
		wt.put(64, '!');
		wt.put(65, ' ');
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		String  stdin = null;
		while ((stdin = parseStdin()) != null) {
/*			int		i = 0;
			int		l = stdin.length();
			boolean	f = (l % 2 == 0);
			String	o = "";

			while (f && i < l) {
				int	c = (stdin.charAt(i)-'0')*10+(stdin.charAt(i+1)-'0');
				if ((f == wt.containsKey(c))) {
					o += wt.get(c);
					i+=2;
				}
			}
			System.out.println((f) ? o: "NA");*/
		}
	}

	private static String parseStdin() {
		String  stdin = null;

		try {
			String  tmp = br.readLine();
			if (tmp != null) {
				if (!tmp.isEmpty()) stdin = tmp;
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}

class WordTbl extends HashMap<Integer, Character> {
}