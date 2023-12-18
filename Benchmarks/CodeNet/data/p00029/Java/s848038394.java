import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Main {
	private	static	BufferedReader			br   = null;
	private	static	HashMap<String,Integer>	freq = null;
	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
		freq = new HashMap<String,Integer>();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String	strIn  = null;
		Integer	v      = null;
		String	strLng = "";
		String	strMax = null;
		Integer	nMax   = 0;

		while((strIn = parseStdin()) != null) {
			String[]	line = strIn.split(" ");
			for (int n = 0; n < line.length; n++) {
				if ((v = freq.get(line[n])) == null) {
					v = new Integer(1);
				}
				else {
					v++;
				}

				if (line[n].length() > strLng.length()) {
					strLng = line[n];
				}

				if (v > nMax) {
					nMax   = v;
					strMax = line[n];
				}

				freq.put(line[n], v);
			}
		}

		System.out.printf("%s %s\n", strMax, strLng);
	}

	private static String parseStdin() {
		String	strNum = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					strNum = line;
				}
			}
		}
		catch (IOException e) {}

		return strNum;
	}
}