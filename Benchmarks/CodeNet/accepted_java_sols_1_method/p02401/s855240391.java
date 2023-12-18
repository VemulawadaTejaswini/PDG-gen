import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			String[] a_op_b = str.split(" ", 0);

			int a = Integer.parseInt(a_op_b[0]);
			String op = a_op_b[1];
			int b = Integer.parseInt(a_op_b[2]);

			if (op.equals("?")) {
				break;
			}
			if (op.equals("+")) {
				System.out.println(a + b);
			}
			if (op.equals("-")) {
				System.out.println(a - b);
			}
			if (op.equals("*")) {
				System.out.println(a * b);
			}
			if (op.equals("/")) {
				System.out.println(a / b);
			}
		}
	}
}