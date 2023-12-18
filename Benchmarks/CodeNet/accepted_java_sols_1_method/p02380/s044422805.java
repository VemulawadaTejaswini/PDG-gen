import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arguments = br.readLine().split(" ");
		double a = Double.parseDouble(arguments[0]);
		double b = Double.parseDouble(arguments[1]);
		double theta = Double.parseDouble(arguments[2]);
		theta = toRadians(theta);
		
		double c = sqrt(pow(a, 2.0) + pow(b, 2.0) - (2.0 * a * b * cos(theta)));
		double surface = a * b * sin(theta) / 2.0;
		double height = b * sin(theta);
		double length = a + b + c;
		
		System.out.println(surface);
		System.out.println(length);
		System.out.println(height);
	}

}