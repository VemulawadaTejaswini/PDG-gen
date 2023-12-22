import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();
		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			int a = (c[i] + n);
			if (a >= 91)
				a -= 26;
			System.out.print((char) (a));
		}
		System.out.print("\n");
	}
}