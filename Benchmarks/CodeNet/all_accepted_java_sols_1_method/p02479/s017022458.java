import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		double r = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
		System.out.printf("%.6f %.6f", r*r*Math.PI, 2*r*Math.PI);
	}
}