import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] set = br.readLine().split(" ");
		double x1 = Double.parseDouble(set[0]);
		double y1 = Double.parseDouble(set[1]);
		double x2 = Double.parseDouble(set[2]);
		double y2 = Double.parseDouble(set[3]);

		double r = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		System.out.printf("%.8f\n", r);
	}
}