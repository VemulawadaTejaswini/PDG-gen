import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = br.readLine();
			int i = line.length();
			StringBuilder sb = new StringBuilder();

			String result = sb.reverse().toString();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}