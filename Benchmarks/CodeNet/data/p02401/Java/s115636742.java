import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		String s = br.readLine();

		if (s.equals("+")) {
			System.out.println(a + b);
			}
		if (s.equals("-")) {
			System.out.println(a - b);
			}

		if (s.equals("*")) {
			System.out.println(a * b);
			}
		if (s.equals("/")) {
			System.out.println(a / b);
			}

	}

}