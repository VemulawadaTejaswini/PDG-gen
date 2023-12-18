import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		long a = Long.parseLong(str[0]);
		double b = Double.parseDouble(str[1]);

		long c = (long) b * 100;
		long d = a * (long) (b * 100 + 0.001) / 100;
		System.out.println(d);
	}
}