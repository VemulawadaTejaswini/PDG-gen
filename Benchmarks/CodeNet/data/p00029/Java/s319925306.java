
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String[] lines = reader.readLine().split(" ");

		Map<String, Integer> memo = new HashMap<String, Integer>();
		int max = 0;
		int maxLength = 0;
		String maxName = "";
		String maxLengthName = "";
		for (int i = 0; i < lines.length; i++) {
			Integer num = memo.get(lines[i]);
			if (num == null) {
				memo.put(lines[i], 1);
				if (maxLength < lines[i].length()) {
					maxLength = lines[i].length();
					maxLengthName = lines[i];
				}
			} else {
				int result = memo.put(lines[i], num + 1) + 1;
				if (max < result) {
					max = result;
					maxName = lines[i];
				}
			}

		}
		System.out.println(maxName + " " + maxLengthName);

	}
}