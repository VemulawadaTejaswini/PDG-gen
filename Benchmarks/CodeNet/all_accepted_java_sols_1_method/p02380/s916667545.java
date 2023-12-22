import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] data = in.readLine().split(" ");
			double a = Double.parseDouble(data[0]);
			double b = Double.parseDouble(data[1]);
			double c = Math.toRadians(Double.parseDouble(data[2]));

			System.out.println((a * b * Math.sin(c)) / 2);
			System.out.println(Math.sqrt((b * Math.sin(c)) * (b * Math.sin(c))
					+ (b * Math.cos(c) - a) * (b * Math.cos(c) - a)) + a + b);
			System.out.println(b * Math.sin(c));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}