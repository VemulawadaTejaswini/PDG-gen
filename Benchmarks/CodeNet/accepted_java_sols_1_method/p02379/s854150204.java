import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		double x1 = Double.parseDouble(arr[0]);
		double y1 = Double.parseDouble(arr[1]);
		double x2 = Double.parseDouble(arr[2]);
		double y2 = Double.parseDouble(arr[3]);

		double width2 = Math.pow(x2 - x1, 2);
		double height2 = Math.pow(y2 - y1, 2);
		double result = Math.sqrt(width2 + height2);

		System.out.printf("%.5f%n", result);

		if (br != null) {
			br.close();
			br = null;
		}
	}
}