import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		double x1 = Double.parseDouble(input[0]);
		double y1 = Double.parseDouble(input[1]);
		double x2 = Double.parseDouble(input[2]);
		double y2 = Double.parseDouble(input[3]);
		double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		System.out.println(distance);
	}
}