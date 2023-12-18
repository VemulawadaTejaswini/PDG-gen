import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String[] line = input.readLine().split(" ");
			String lb = System.getProperty("line.separator");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			double c = toRadians(Integer.parseInt(line[2]));
			
			double area = (a * b * sin(c)) / 2;
			double perimeter = a + b + pow(pow(a, 2) + pow(b, 2) - 2 * a * b * cos(c), 0.5);
			double height = b * sin(c);
			
			System.out.println(new StringBuilder().append(String.valueOf(area)).append(lb).append(String.valueOf(perimeter)).append(lb).append(String.valueOf(height)).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}