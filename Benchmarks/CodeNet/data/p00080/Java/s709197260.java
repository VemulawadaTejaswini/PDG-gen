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
		HashMap<Integer, Double>	result = new HashMap<Integer, Double>();
		int							key    = 0;
		double						value  = 0;

		while ((key = parseKey()) != -1) {
			if (result.containsKey(key)) {
				value = result.get(key);
			}
			else {
				value = calc(key);
				result.put(key, value);
			}
			System.out.printf("%.6f\n", value);
		}
	}

	private static double calc(int key) {
		double	x = (double)key / 2.0;

		while (true) {
			x -= (Math.pow(x, 3.0) - (double)key) / (3 * Math.pow(x, 2.0));
			if (Math.abs(Math.pow(x, 3.0) - (double)key) < 1e-6f) {
				break;
			}
		}
		
		return x;
	}

	private static int parseKey() {
		int		key   = -1;
		String	stdin = null;

		if ((stdin = parseStdin()) != null) {
			if (!stdin.isEmpty()) {
				key = Integer.parseInt(stdin);
			}
		}
		
		return key;
	}

	private static String parseStdin() {
		String	stdin = null;

		try {
			String line = br.readLine();
			if (line != null) {
				if (!line.isEmpty()) {
					stdin = line;
				}
			}
		}
		catch (IOException e) {}

		return stdin;
	}
}