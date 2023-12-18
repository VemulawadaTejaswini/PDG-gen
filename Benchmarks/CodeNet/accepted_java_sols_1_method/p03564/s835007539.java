import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int n = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());

			int i = 0;
			int value = 1;
			for (; i < n && value <= k; i++) {
				value *= 2;
			}

			for (; i < n; i++) {
				value += k;
			}

			System.out.println(value);
		}
	}
}