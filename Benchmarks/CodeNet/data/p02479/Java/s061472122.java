import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String line;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			line = reader.readLine();

			double r = Double.parseDouble(line);
			double pi = Math.PI;
			double area = r * r * pi;
			double length = 2 * r * pi;
			System.out.println(area + " " + length);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}