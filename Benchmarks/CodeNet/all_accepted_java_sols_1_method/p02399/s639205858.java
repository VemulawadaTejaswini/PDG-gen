import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] numbers = input.split(" ");
		Integer a = Integer.parseInt(numbers[0]);
		Integer b = Integer.parseInt(numbers[1]);
		Integer remain = a % b;
		Integer div_int = (a - remain) / b;
		String div_float = String.format("%.5f", (double)a / b);
		System.out.println(div_int + " " + remain + " " + div_float);
	}
}