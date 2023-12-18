import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));

		double r = Double.parseDouble(buffReader.readLine());

		System.out.println((r * r * Math.PI) + " " + (2 * r * Math.PI));
	}
}