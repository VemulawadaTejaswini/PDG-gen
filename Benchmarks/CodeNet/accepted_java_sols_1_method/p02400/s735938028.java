import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		double r = Double.parseDouble(line);
		System.out.printf("%.6f %.6f%n", r*r*Math.PI, 2*r*Math.PI);
	}
}