import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		double r = Double.parseDouble(str);

		double circ = (2 * Math.PI * r);
		double are = (Math.PI * r * r);

		System.out.printf("%f %f\n",are ,circ);
	}
}