import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				String[] s = reader.readLine().split(" ");
				int a = Integer.parseInt(s[0]);
				String op = s[1];
				int b = Integer.parseInt(s[2]);
				if (op.equals("+"))
					System.out.println(a + b);
				if (op.equals("-"))
					System.out.println(a - b);
				if (op.equals("*"))
					System.out.println(a * b);
				if (op.equals("/"))
					System.out.println(a / b);
				if (op.equals("?"))
					break;
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}