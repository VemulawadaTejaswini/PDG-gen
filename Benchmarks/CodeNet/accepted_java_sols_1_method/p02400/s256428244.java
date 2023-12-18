import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;

		try {
			input = br.readLine();
		} catch (IOException e) {
		}
		double r = Double.parseDouble(input);
		double menseki =  r * r * Math.PI;
		double syuu =  (2 * r) * Math.PI;

		//System.out.println(menseki + " " + syuu);
		System.out.printf("%f %f\n", menseki, syuu);
	}
}
