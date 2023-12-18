import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] numstr = str.split(" ", 4);
		double x1 = Double.parseDouble(numstr[0]);
		double y1 = Double.parseDouble(numstr[1]);
		double x2 = Double.parseDouble(numstr[2]);
		double y2 = Double.parseDouble(numstr[3]);
		double distance = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2),
				0.5);
		System.out.println(distance);
	}
}