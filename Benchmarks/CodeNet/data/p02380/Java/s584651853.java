import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		double a = Double.parseDouble(input[0]);
		double b = Double.parseDouble(input[1]);
		double th = Math.PI * Double.parseDouble(input[2]) / 180.0;
		double c = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(th));
		double s = a * b * Math.sin(th) / 2.0;
		System.out.println(s);
		System.out.println(a + b + c);
		System.out.println(2.0 * s / a);
	}
}