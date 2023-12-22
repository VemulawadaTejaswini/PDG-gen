import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= 50000; i++) {
			int x = (int) (i * 1.08);

			if (x == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(":(");
	}
}
