import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static int ans[];
	static int count = 0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");

		if (str[2].equals(str[3]) && str[4].equals(str[5])) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
