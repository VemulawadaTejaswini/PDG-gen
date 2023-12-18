import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String str = reader.readLine();
				String[] arr = str.split(" ");
				String op = arr[1];
				if ("?".equals(arr[1])) {
					break;
				}
				int a = Integer.parseInt(arr[0]);
				int b = Integer.parseInt(arr[2]);
				int sum = 0;
				switch (op) {
				case "+":
					sum = a + b;
					break;
				case "-":
					sum = a - b;
					break;
				case "*":
					sum = a * b;
					break;
				case "/":
					sum = a / b;
					break;
				default:
					break;
				}
				System.out.println(sum);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}