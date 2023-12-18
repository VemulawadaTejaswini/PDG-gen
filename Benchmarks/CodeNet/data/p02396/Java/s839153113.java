import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		for (int i = 1; (line = br.readLine()) != null; i++) {
			if ("0".equals(line)) break;
			System.out.println("Case " + i + ": " + line);
		}
	}
}