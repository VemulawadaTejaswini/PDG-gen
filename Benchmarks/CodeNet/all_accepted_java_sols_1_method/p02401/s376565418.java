import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] input;
			int a, b, ret = 0;
			String op;
			do {
				input = br.readLine().split(" ");
				a = Integer.parseInt(input[0]);
				op = input[1];
				b = Integer.parseInt(input[2]);
				if (op.equals("?")) {
					break;
				} else {
					if (op.equals("+")) {
						ret = a + b;
					} else if (op.equals("-")) {
						ret = a - b;
					} else if (op.equals("*")) {
						ret = a * b;
					} else if (op.equals("/")) {
						ret = a / b;
					}
					System.out.println(ret);
				}
			} while (true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}