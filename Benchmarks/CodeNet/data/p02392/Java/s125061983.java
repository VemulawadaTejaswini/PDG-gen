import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = br.readLine();

			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);

			if (a < b && b < c) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}