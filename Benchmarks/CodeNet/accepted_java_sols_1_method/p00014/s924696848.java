
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;
		String s;
		while ((s = reader.readLine()) != null) {
			int d = Integer.parseInt(s);
			int sum = 0;
			for (int i = d; i < 600; i += d) {
				sum += Math.pow(i, 2) * d;
			}
			System.out.println(sum);
		}
	}

}