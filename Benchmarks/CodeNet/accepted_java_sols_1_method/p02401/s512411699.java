import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split(" ");
			int a = Integer.parseInt(arr[0]);
			String op = arr[1];
			int b = Integer.parseInt(arr[2]);
			if ("?".equals(op))
				break;

			if ("+".equals(op))
				System.out.println(a + b);
			else if ("-".equals(op))
				System.out.println(a - b);
			else if ("*".equals(op))
				System.out.println(a * b);
			else if ("/".equals(op))
				System.out.println(a / b);
		}
	}
}