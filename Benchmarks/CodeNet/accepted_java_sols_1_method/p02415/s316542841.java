import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] line = br.readLine().toCharArray();

		for(int i = 0; i < line.length; ++i) {
			if (Character.isUpperCase(line[i])) {
				line[i]=Character.toLowerCase(line[i]);
			} else {
				line[i]=Character.toUpperCase(line[i]);
			}
		}
		System.out.println(line);
	}
}