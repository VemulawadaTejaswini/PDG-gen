import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			int sum = 0, div = 5;
			while (n / div != 0) {
				sum += n / div;
				div *= 5;
			}
			System.out.println(sum);
		}

	}

}