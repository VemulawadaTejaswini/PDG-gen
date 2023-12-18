import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			while (true) {
				String input = br.readLine();
				String[] cut = input.split(" ");
				int a = Integer.parseInt(cut[0]);
				String op = cut[1];
				int b = Integer.parseInt(cut[2]);
				if (op.equals("?"))
					break;
				switch (op) {
				case "+":
					System.out.println(a + b);
					break;
				case "-":
					System.out.println(a - b);
					break;
				case "*":
					System.out.println(a * b);
					break;
				case "/":
					System.out.println(a / b);
					break;
				}

			}
			br.close();
		} catch (Exception e) {
			System.exit(-1);
		}

	}
}