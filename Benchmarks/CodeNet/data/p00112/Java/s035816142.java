import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			if (n == 0) {
				break;
			}

			int[] wait = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				wait[i] = Integer.parseInt(br.readLine());
			}
			Arrays.sort(wait);
			for (int i = 0; i < n - 1; i++) {
				sum += wait[i] * (n - 1 - i);
			}
			System.out.println(sum);
		}
	}
}