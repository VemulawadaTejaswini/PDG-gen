
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		while ((line = reader.readLine()) != null) {
			if (line.isEmpty()) {
				break;
			}
			int n = Integer.parseInt(line);
			char[] a = new StringBuilder(Integer.toBinaryString(n)).reverse()
					.toString().toCharArray();
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] != '0') {
					if (count != 0) {
						builder.append(' ');
					}
					builder.append((int) Math.pow(2, i));
					count++;
				}
			}
			builder.append('\n');
		}
		System.out.print(builder);
	}
}