
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line[] = br.readLine().split(" ");
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		String x = "Impossible";

		if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) {
			x = "Possible";
		}
		System.out.println(x);
	}
}