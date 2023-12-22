import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String input = br.readLine();
			double r = Double.parseDouble(input);
			double men = r * r * Math.PI;
			double en = 2 * r * Math.PI;
			System.out.println(String.format("%.6f", men) + " " + String.format("%.6f", en));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}