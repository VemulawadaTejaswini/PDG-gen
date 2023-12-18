import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] v = br.readLine().split(" ");
			int a = Integer.parseInt(v[0]);
			int b = Integer.parseInt(v[1]);

			if (a < b) {
				System.out.println("a < b");
			} else if (a > b) {
				System.out.println("a > b");
			} else {
				System.out.println("a == b");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}