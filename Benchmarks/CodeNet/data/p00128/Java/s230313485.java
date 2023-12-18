import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		String  	stdin = null;
		boolean		first = true;
		char[][]	map   = new char[8][5];

		Arrays.fill(map[2], '=');

		while ((stdin = parseStdin()) != null) {
			int	l = stdin.length();
			int	d = 5-l;

			Arrays.fill(map[0], '*');
			Arrays.fill(map[1], '*');
			Arrays.fill(map[3], '*');
			Arrays.fill(map[4], '*');
			Arrays.fill(map[5], '*');
			Arrays.fill(map[6], '*');
			Arrays.fill(map[7], '*');

			for (int i = 0; i < 5; i++) {
				int	cn = (i-d>=0) ? stdin.codePointAt(i-d)-'0' : 0;
				map[1-cn/5][i] = ' ';
				map[3+cn%5][i] = ' ';
			}

			if (!first) {
				System.out.println("");
			} else {
				first = false;
			}

			for (int i = 0; i < map.length; i++) {
				System.out.println(map[i]);
			}
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