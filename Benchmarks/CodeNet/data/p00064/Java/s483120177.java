
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		String line;
		int count = 0;
		while ((line = reader.readLine()) != null) {
			Pattern pattern = Pattern.compile("([0-9]+)");
			Matcher matcher = pattern.matcher(line);
			while (matcher.find()) {
				count += Integer.parseInt(matcher.group());
			}
		}
		System.out.println(count);
	}

}