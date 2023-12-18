import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String inputLine;
			while ((inputLine = br.readLine()) != null) {

				final String[] inputs = inputLine.split(" ");

				final Integer a = Integer.valueOf(inputs[0]);
				final String op = inputs[1];
				final Integer b = Integer.valueOf(inputs[2]);

				if(op.equals("?")) {
					break;
				}

				switch(op) {
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
				}
			}
		}
	}
}
