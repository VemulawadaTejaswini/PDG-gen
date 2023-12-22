import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);

		if (a >= 13) {
			System.out.println(b);
		} else if (a >= 6) {
			System.out.println(b / 2);
		} else {
			System.out.println("0");
		}
	}
}
