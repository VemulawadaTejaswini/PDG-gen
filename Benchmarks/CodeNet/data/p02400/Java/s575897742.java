import java.io.*;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Double radius = Double.parseDouble(br.readLine());
		Double diameter = radius * 2;
		Double area = radius*radius*Math.PI;
		Double circumference = diameter * Math.PI;
		System.out.println(String.format("%.6f", area) + " " + String.format("%.6f", circumference));
	}
}