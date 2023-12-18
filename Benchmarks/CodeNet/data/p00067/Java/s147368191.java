import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			String	stdin  = null;
			String	prev   = "000000000000";
			int		island = 0;
			int		len    = prev.length();

			for(int n = 0; n < len; n++) {
				stdin = parseStdin();
				if (stdin.contains("1")) {
					for (int i = 0; i < len; i++) {
						if (stdin.charAt(i) == '1') {
							boolean	isnew = true;
		
							for (int j = i; j < len; j++, i++) {
								if (stdin.charAt(j) != '1') {
									break;
								}
								isnew = (prev.charAt(j) == '1') ? false : isnew;
							}
		
							island = (isnew) ? island + 1: island;
						}
					}
				}

				prev = stdin;
			}

			System.out.println(island);

			if (parseStdin() == null) {
				break;
			}
		}
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			stdin = br.readLine();
		}
		catch (IOException e) {}

		return stdin;
	}
}