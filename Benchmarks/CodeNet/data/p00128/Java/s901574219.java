import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class Main {
	private	static	BufferedReader	br = null;
	private	static	int[]			at = { 0x0000004F, 0x00000057, 0x0000005B, 0x0000005D, 0x0000005E, 0x0000002F, 0x00000037, 0x0000003B, 0x0000003D, 0x0000003E };

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
		String  stdin = null;
		boolean	first = true;
		int[]	map   = new int[5];

		while ((stdin = parseStdin()) != null) {
//			int		i = 0;
			int	l = stdin.length();

			Arrays.fill(map, at[0]);
			for (int i = 0; i < l; i++) {
				map[4-i] = at[stdin.codePointAt(l-i-1)-'0'];
			}

			if (!first) {
				System.out.println("");
			} else {
				first = false;
			}

			for (int i = 6; i >= 5; i--) {
				int		b = 1 << i;
				String	o = "";
				for (int j = 0; j < 5; j++) {
					o += ((map[j] & b) > 0) ? "*" : " "; 
				}
				System.out.println(o);
			}

			System.out.println("=====");

			for (int i = 4; i >= 0; i--) {
				int		b = 1 << i;
				String	o = "";
				for (int j = 0; j < 5; j++) {
					o += ((map[j] & b) > 0) ? "*" : " "; 
				}
				System.out.println(o);
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