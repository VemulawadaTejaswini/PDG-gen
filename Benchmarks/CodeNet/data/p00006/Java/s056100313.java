import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String line = br.readLine();
			int i, len = line.length();
			StringBuilder sb = new StringBuilder();

			for (i = (len - 1); i >= 0; i--) {
				sb.append(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}