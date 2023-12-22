import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int k = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);

		if (500 * k >= x) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}