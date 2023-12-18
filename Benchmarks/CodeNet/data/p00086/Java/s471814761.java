import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


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
		int[]	params = null;
		String	out    = "";

		while ((params = parseParams()) != null) {
			if (params.length != 2) {
				continue;
			}

			HashMap<Integer, Boolean>	result = new HashMap<Integer, Boolean>();
			while (params[0] != 0 && params[1] != 0) {
				for (int key:params) {
					Boolean	val = true;

					switch (key) {
					case 1:
					case 2:
						val = (result.containsKey(key)) ? !result.get(key) : true;
						break;
					default:
						val = (result.containsKey(key)) ? !result.get(key) : false;
						break;
					}

					result.put(key, val);
				}
				params = parseParams();
			}

			out += result.containsValue(false) ? "NG\n" : "OK\n";
		}

		System.out.print(out);
	}

	private static  int[] parseParams() {
		int[]		params = null;
		String[]	split  = null;
		String		strIn  = null;
 
		if ((strIn = parseStdin()) != null) {
			split  = strIn.split(" ");
			params = new int[split.length];
			for (int n = 0; n < split.length; n++) {
				params[n] = Integer.parseInt(split[n]);
			}
		}
		 
		return params;
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