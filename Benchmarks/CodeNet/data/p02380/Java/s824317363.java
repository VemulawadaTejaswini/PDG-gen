import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			String[] points = str.split(" ");
			double a = Double.parseDouble(points[0]);
			double b = Double.parseDouble(points[1]);
			double c = Double.parseDouble(points[2]);
			
			double S = a * b * Math.sin(Math.toRadians(c)) / 2;
			double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(c)));
			double h = b * Math.sin(Math.toRadians(c));
			
			System.out.println(S + " " + L + " " + h);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}