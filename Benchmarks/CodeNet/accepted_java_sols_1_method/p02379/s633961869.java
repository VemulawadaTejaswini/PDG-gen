import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) {
		try {

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			String[] points = str.split(" ");
			double x1 = Double.parseDouble(points[0]);
			double y1 = Double.parseDouble(points[1]);
			double x2 = Double.parseDouble(points[2]);
			double y2 = Double.parseDouble(points[3]);
			
			double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); 
			System.out.println(d);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}