import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] point = br.readLine().split(" ");
		
		double x1 = Double.parseDouble(point[0]);
		double y1 = Double.parseDouble(point[1]);
		double x2 = Double.parseDouble(point[2]);
		double y2 = Double.parseDouble(point[3]);
		
		double a = Math.abs(x2 - x1);
		double b = Math.abs(y2 - y1);
		
		double a2 = a * a;
		double b2 = b * b;
		
		double c = Math.sqrt(a2 + b2);
		
		System.out.printf("%.8f\n", c);
	}
}