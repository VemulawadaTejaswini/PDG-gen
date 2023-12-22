import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(in.readLine());

		double pi = Math.PI;
		double S = r * r * pi;
		double R = 2 * r * pi;
		System.out.printf("%.6f %.6f", S, R);
	}
}