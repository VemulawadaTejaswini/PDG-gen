
import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static int[] MASK = { 1, 2, 4 };

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String str = in.readLine();
		int[] vals = new int[4];
		for (int i = 0; i < str.length(); ++i) {
			vals[i] = Integer.parseInt(str.substring(i, i + 1));
		}
		boolean[] pattern = search(vals);
		System.out.println(toStr(vals, pattern));
	}

	static String toStr(int[] vals, boolean[] pattern) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(vals[0]);
		for (int i = 1; i < 4; ++i) {
			if (pattern[i]) {
				strBuilder.append("+" + vals[i]);
			} else {
				strBuilder.append("-" + vals[i]);
			}
		}
		strBuilder.append("=7");
		return strBuilder.toString();
	}

	static boolean[] search(int[] vals) {
		for (int i = 0; i < 8; ++i) {
			boolean[] pattern = conv(i);
			int v = calc(vals, pattern);
			if (v == 7) {
				return pattern;
			}
		}
		return null;
	}

	static int calc(int[] vals, boolean[] pattern) {
		int result = 0;
		for (int i = 0; i < vals.length; ++i) {
			if (pattern[i]) {
				result += vals[i];
			} else {
				result -= vals[i];
			}
		}
		return result;
	}

	static boolean[] conv(int v) {
		boolean[] result = new boolean[4];
		result[0] = true;
		for (int i = 0; i < MASK.length; ++i) {
			if ((MASK[i] & v) > 0) {
				result[i + 1] = true;
			} else {
				result[i + 1] = false;
			}
		}
		return result;
	}
}