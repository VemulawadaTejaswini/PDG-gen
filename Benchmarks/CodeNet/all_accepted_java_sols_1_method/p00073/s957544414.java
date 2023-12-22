import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int x = Integer.parseInt(br.readLine());
			int h = Integer.parseInt(br.readLine());
			if (x == 0 && h == 0) break;
			double temp = 2 * Math.sqrt(((double)(x * x) / 4) + (h * h));
			System.out.println(x * (x + temp));
		}

	}

}