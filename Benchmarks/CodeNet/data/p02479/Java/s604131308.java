import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		double pie = 3.141592653589;
		double r = Float.parseFloat(str);

		float circ = (float)(2 * pie * r);
		float are = (float)(pie * r * r);

		System.out.printf("%f %f",are ,circ);
	}
}