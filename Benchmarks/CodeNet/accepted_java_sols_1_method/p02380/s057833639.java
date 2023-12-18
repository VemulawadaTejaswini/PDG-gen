import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] set = br.readLine().split(" ");
		double a = Double.parseDouble(set[0]);
		double b = Double.parseDouble(set[1]);
		double c = Double.parseDouble(set[2]) * Math.PI / 180;

		double S = a * b * Math.sin(c) / 2;
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(c));
		double h = b * Math.sin(c);
		System.out.println(S + "\n" + L + "\n" + h);
	}
}