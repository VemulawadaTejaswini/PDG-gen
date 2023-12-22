import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int x = Integer.parseInt(sa[0]);
		br.close();

		for (long a = -1000; a <= 1000; a++) {
			for (long b = -1000; b <= 1000; b++) {
				if (a * a * a * a * a - b * b * b * b * b == x) {
					System.out.println(a + " " + b);
					return;
				}
			}
		}
	}
}
