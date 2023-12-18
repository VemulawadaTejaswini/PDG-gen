import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		double C = Double.parseDouble(str[2]);

		double S = 0.5 * a * b * Math.sin(Math.toRadians(C));
		double L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(Math.toRadians(C)));
		double h = b * Math.sin(Math.toRadians(C));

		System.out.println(S + "\n" + L + "\n" + h);
	}
}