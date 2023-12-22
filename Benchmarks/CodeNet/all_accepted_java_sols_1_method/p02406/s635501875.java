import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line = br.readLine();
		int n  = Integer.parseInt(line);

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			} else {
				String s = Integer.toString(i);
				if (s.contains("3")) {
					System.out.print(" " + i);
				}
			}
		}
		System.out.println("");
	}
}