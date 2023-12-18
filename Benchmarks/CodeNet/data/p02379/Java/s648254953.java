import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			String[] data = in.readLine().split(" ");
			double x0 = Integer.parseInt(data[0]);
			double y0 = Integer.parseInt(data[1]);
			double x1 = Integer.parseInt(data[2]);
			double y1 = Integer.parseInt(data[3]);
			
			System.out.println(Math.sqrt((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1)));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}