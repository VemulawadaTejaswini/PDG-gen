import java.io.*;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double x1 = Double.parseDouble(s.next());
		double y1 = Double.parseDouble(s.next());
		double x2 = Double.parseDouble(s.next());
		double y2 = Double.parseDouble(s.next());
		s.close();

		double a = Math.pow(x2 - x1, 2);
		double b = Math.pow(y2 - y1, 2);
		System.out.println(String.format("%.8f", Math.sqrt(a + b)));
	}
}