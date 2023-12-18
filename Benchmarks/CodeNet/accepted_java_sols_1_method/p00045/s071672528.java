import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String line = "";
		int c = 0, d = 0, sum = 0;
		while ((line = br.readLine()) != null) {
			String[] str = line.split(",");
			int price = Integer.parseInt(str[0]);
			int cnt = Integer.parseInt(str[1]);
			c += cnt;
			sum += price * cnt;
			d++;
		}
		System.out.printf("%d\n%.0f\n", sum, (double)c / d);

	}

}