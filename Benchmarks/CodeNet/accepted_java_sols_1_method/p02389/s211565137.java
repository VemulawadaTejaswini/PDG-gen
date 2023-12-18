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

			System.out.println((a * b) + " " + (a * 2 + b * 2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}