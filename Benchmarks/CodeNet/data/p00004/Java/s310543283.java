import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    
		String str = "";
		try {
			while ((str = in.readLine()) != null) {
				String[] nums = str.split(" ");

				double a = Double.parseDouble(nums[0]);
				double b = Double.parseDouble(nums[1]);
				double c = Double.parseDouble(nums[2]);
				double d = Double.parseDouble(nums[3]);
				double e = Double.parseDouble(nums[4]);
				double f = Double.parseDouble(nums[5]);
				
				double x = (e * c - b * f) / (a * e - b * d);
				double y = (a * f - d * c) / (a * e - b * d);
				if (x == -0.0) x = 0.0;
				if (y == -0.0) y = 0.0;
				System.out.printf("%.3f %.3f", x, y);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}