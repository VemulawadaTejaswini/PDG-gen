import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arguments = br.readLine().split(" ");
		double x1 = Double.parseDouble(arguments[0]);
		double y1 = Double.parseDouble(arguments[1]);
		double x2 = Double.parseDouble(arguments[2]);
		double y2 = Double.parseDouble(arguments[3]);
		
		double dx = abs(x2 - x1);
		double dy = abs(y2 - y1);
		
		double distance = sqrt(pow(dx, 2) + pow(dy, 2));
		
		System.out.println(distance);
	}

}